package ex02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {

	public static List<Emp> find(String job){
		List<Emp> list = new ArrayList<Emp>();
		
		//EMP테이블에서 사원번호(EMPNO),이름(ENAME),직종(JOB),급여(SAL)
		//을 조회해서 하나의 행을 Emp 객체에 넣은 후 그 객체들을 ArrayList에
		//담아서 반환하기
		
		//Statement 보안위험
		// 'OR '1' = ' 1 같은 값이 들어가게 되면 전체 테이블이 출력되는 SQL Injection발생 위험
		// SELECT * FROM emp WHERE ename = '' OR '1'='1' -> 무조건 참이기 때문에 위험
		//Statement -> PreparedStatement
		//sql -> ?
		
		// id : ' OR '1' = ' 1 -> 로그인이 되어버릴 위험이 있음
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB= ?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, job); //1번째 ?자리를 매개변수로 들어온 job 값으로 채워라
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Emp e = new Emp();
				e.setEmpno(rs.getInt("empno"));
				e.setEname(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setSalary(rs.getInt("sal"));
				
				list.add(e);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return list;
		
	}
}
