package jSonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
	// note : doi tuong ky hieu : {}
	    //  : mang ky hieu : [] , trong mang thi co nhieu doi tuong
	
	/*
	 * doc file json theo doi tuong  cach don gian nhat
	 */
	JSONParser jsonParser = new JSONParser();// read moi dung thang nay
	JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("khoa.json"));
	String maKh,tenKh;
	maKh = jsonObject.get("maKH").toString();
	tenKh= jsonObject.get("tenKH").toString();
	System.out.println(maKh+"-"+tenKh);
	
	/*
	 * doc file json theo mang nhiu doi tuong
	 */
	// qusm diem : vd co file json dsKhoa.jspn trong project json
	// dau tien la doi tuong dsKhoa trong doi tuog nay co value la cac jsonarray trong cac jsonarray la cac doi tuong khac
	JSONParser jsonParser1 = new JSONParser();
	JSONObject jsonObject1 = (JSONObject) jsonParser.parse(new FileReader("dsKhoa.json"));
	JSONArray array = (JSONArray) jsonObject1.get("dsKH");// lay doi tuong dsKH la cac array
	// sau len tren ta co doi tuong dskhoa chua 1 array value chua cac doi tuong khac
	System.out.println("-----------------------------------------------------------");
	System.out.println("Danh sach khoa trong file dsKhoa.json : ");
	for(int i=0;i<array.size();i++) {
		JSONObject jsonObject2 = (JSONObject) array.get(i);
		String maKh1,tenKh1;
		maKh1 = jsonObject2.get("maKH").toString();
		tenKh1= jsonObject2.get("tenKH").toString();
		System.out.println(maKh1+" - "+tenKh1);
	}
	
	/*
	 * doc file json thongtincanha vd sach T3H - 
	 * phan tich file : la doi tuong : 4 doi tuong mang gia tri string, int , array rieng doi tuong 4 la array trong array chi la gia tri string
	 */
	
	JSONParser jsonParservd1 = new JSONParser();
	JSONObject jsonObjectvd1 = (JSONObject) jsonParser.parse(new FileReader("thongtincanhan.json"));
	String name,address;
	int age;
	String course="";
	name = jsonObjectvd1.get("name").toString();
	address = jsonObjectvd1.get("address").toString();
	age = Integer.parseInt(jsonObjectvd1.get("age").toString());
	JSONArray arrayvd1 = (JSONArray) jsonObjectvd1.get("courses");
	for(int i=0;i<arrayvd1.size();i++) {
		course = course+ (String) arrayvd1.get(i)+"/";
		
	}
	System.out.println("-----------------------------------------------------------");
	System.out.println("Thong tin ca nhan trong file thongtincanhan.json: ");
	System.out.println(name+" - "+ address+" - "+age+" - "+course);
}
}
