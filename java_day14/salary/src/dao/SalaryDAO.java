package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import domain.SalaryVO;

public class SalaryDAO {
//	�߰�
	public void insert(SalaryVO salaryVO) throws IOException{
		BufferedWriter bufferedWriter = DBConnecter.getAppend();
		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.PATH)));
		String temp = null;
		temp = content.charAt(content.length() - 1) == '\n' ? "" : "\n";
		temp += salaryVO.toString();
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}
	
//	����(�ҵ漼)
	public void update(SalaryVO salaryVO) throws IOException {
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";
		
		while((line = bufferedReader.readLine()) != null) {
			if(line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "����")) {
				String data = line.substring(0, line.lastIndexOf("   "));
				
				temp += data.substring(0, data.lastIndexOf("   ")) + "   " 
						+ insertComma(salaryVO.getIncomeTax()) + "   "
						+ insertComma(salaryVO.getLocalTax()) + "\n";
				continue;
			}
			temp += line + "\n";
		}
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
		bufferedWriter.write(temp);
		
		bufferedWriter.close();
		bufferedReader.close();
	}
//	����
	
//	��ȸ
	
//	���
	
	public static String insertComma(int number) {
		String temp = String.valueOf(number);
		String result = "";
		
		for (int i = 0; i < temp.length(); i++) {
			if(i != 0 && i % 3 == 0) {
				result = "," + result;
			}
			result = temp.charAt(temp.length() - 1 - i) + result;
		}
		return result;
	}
	
}






























