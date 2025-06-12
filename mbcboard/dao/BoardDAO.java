package mbcboard.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import mbcboard.dto.BoardDTO;

public class BoardDAO {

	public BoardDTO boardDTO = new BoardDTO();
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	public int result = 0;
	
	public BoardDAO() {
		try {
			// 예외가 발생할 수 있는 실행문
			// 프로그램 강제종료 처리용
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계 ojdbc6.jar 호출
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "boardtest",
					"boardtest"); // 2단계
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나, ojdbc6.jar 파일이 잘못 되었습니다.");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		} catch (SQLException e) {
			System.out.println("url, id, pw가 잘못 되었습니다. BoardDAO에 기본생성자를 확인하세요");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		}
	} // 기본 생성자 종료

	public void selectAll() throws SQLException {
		
		try {
			String sql = "select bno, btitle, bwriter, bdate from board order by bdate desc";
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
		
			System.out.println("번호 \t 제목 \t 작성자 \t 작성일 \t");
		while (resultSet.next()) {
			
			System.out.print(resultSet.getInt("bno") + "\t");
			System.out.print(resultSet.getString("btitle") + "\t");
			System.out.print(resultSet.getString("bwriter") + "\t");
			System.out.println(resultSet.getDate("bdate") + "\t");
		}
			System.out.println("============끝============");
			
		}catch(SQLException e) {
			
			System.out.println("selectAll()메서드에 쿼리문이 잘못 되었습니다.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			statement.close();
			
		}
		
	}

	public void insertBoard(BoardDTO boardDTO) throws SQLException {
		
		try {
			String sql = "insert into board(bno, btitle, bcontent, bwriter, bdate)"
					+ "values(board_seq.nextval, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle());
			preparedStatement.setString(2, boardDTO.getBcontent());
			preparedStatement.setString(3, boardDTO.getBwriter());
			System.out.println("쿼리 확인 : " + sql);
			
			result = preparedStatement.executeUpdate();
			
			if (result > 0) {
				System.out.println(result + "개의 게시물이 등록 되어 있습니다.");
				connection.commit();
			} else {
				System.out.println("쿼리 실행 결과 : " + result);
				System.out.println("입력실패");
				connection.rollback();
			}
		} catch(SQLException e) {
			System.out.println("예외 발생 : insertBoard()메서드에서 쿼리문을 확인하세요");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
		
	}

	public void readOne(String title) throws SQLException {
		
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from board where btitle = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, title);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				BoardDTO boardDTO = new BoardDTO();
				
				boardDTO.setBno(resultSet.getInt("bno"));
				boardDTO.setBtitle(resultSet.getString("btitle"));
				boardDTO.setBcontent(resultSet.getString("bcontent"));
				boardDTO.setBwriter(resultSet.getString("bwriter"));
				boardDTO.setBdate(resultSet.getDate("bdate"));
				
				System.out.println("=========================");
				System.out.println("번호 : " + boardDTO.getBno());
				System.out.println("제목 : " + boardDTO.getBtitle());
				System.out.println("내용 : " + boardDTO.getBcontent());
				System.out.println("작성자 : " + boardDTO.getBwriter());
				System.out.println("작성일 : " + boardDTO.getBdate());
				
			} else {
				System.out.println("해당하는 게시물이 존재하지 않습니다.");
			}
		} catch(SQLException e) {
			System.out.println("예외 발생 : readOne() 메서드를 확인하세요");
			e.printStackTrace();
		} finally {
			resultSet.close();
			preparedStatement.close();
		}
		
	}

	public void modify(String title, Scanner inputStr) throws SQLException {
		
		BoardDTO boardDTO = new BoardDTO();
		
		System.out.println("수정할 내용을 입력하세요");
		System.out.println("제목 : ");
		boardDTO.setBtitle(inputStr.next());
		
		Scanner inputLine = new Scanner(System.in);
		System.out.println("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine());
		
		try {
			String sql = "update board set btitle = ?, bcontent = ?, bdate = sysdate where btitle = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle());
			preparedStatement.setString(2, boardDTO.getBcontent());
			preparedStatement.setString(3, title);
			
			result = preparedStatement.executeUpdate();
			
			if (result > 0) {
				System.out.println(result + "개의 데이터가 수정 되었습니다.");
				connection.commit();
			}else {
				System.out.println("수정이 되지 않았습니다.");
				connection.rollback();
			}
		}catch (SQLException e) {
			System.out.println("예외 발생 : modify() 메서드와 sql문을 확인하세요.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
		
	}

	public void deleteOne(int selectBno) throws SQLException {
		
		try {
			String sql = "delete from board where bno =?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, selectBno);;
			
			result = preparedStatement.executeUpdate();
			
			if(result >0) {
				System.out.println(result + "게시물이 삭제되었습니다.");
				connection.commit();
			}else {
				System.out.println("게시물이 삭제되지 않았습니다.");
				connection.rollback();
			}
			
			System.out.println("========================");
			selectAll(); // 삭제 후 전체 리스트 보기
		} catch(SQLException e) {
			System.out.println("예외 발생 : deleteOne() 메서드와 sql문을 확인하세요");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
		
	}
	
}
