package jSonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BT_3_1 {
public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
	JSONParser jsonParser = new JSONParser();
	JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("BT3_1_InformationLTD.json"));
	JSONObject jsonObjectChild1 = (JSONObject) jsonObject.get("info_company");
	String nameC,add,mail,phone, brach; int staffC;
	nameC = jsonObjectChild1.get("nameC").toString();
	add = jsonObjectChild1.get("add").toString();
	mail = jsonObjectChild1.get("mail").toString();
	phone = jsonObjectChild1.get("phone").toString();
	staffC = Integer.parseInt(jsonObjectChild1.get("staffC").toString());
	System.out.println("****** Thong tin cong ty ******");
	System.out.println("Ten cong ty : "+nameC);
	System.out.println("Dia Chi: "+add);
	System.out.println("Mail: "+mail);
	System.out.println("So dien thoai: "+phone);
	System.out.println("Tong so nhan vien: "+staffC);
	System.out.println("****** Thong tin don vi ******");
	JSONArray array = (JSONArray) jsonObject.get("info_brach");
	
	String id; int staffB;
	
	for(int i=0; i<array.size();i++) {
		JSONObject jsonObjectChild2 = (JSONObject) array.get(i);
		id = jsonObjectChild2.get("ID").toString();
		staffB = Integer.parseInt(jsonObjectChild2.get("staffB").toString());
		System.out.println(i+1 +"/"+"Ten don vi : "+id+"\n So nhan vien : "+staffB);
	}
}
}
