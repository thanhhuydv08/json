package jSonObject;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {
public static void main(String[] args) throws IOException {
	/*
	 * ghi doi tuong don gian  : da chay ok
	 */
//	JSONObject jsonObject = new JSONObject();
//	jsonObject.put("name", "Nguyen Thanh Huy");
//	jsonObject.put("age", 30);
//	jsonObject.put("Gen", "male");
//	FileWriter fileWriter = new FileWriter("namecard.json");
//	fileWriter.write(jsonObject.toJSONString());
//	fileWriter.close();
	/*
	 * ghi doi tuong co chua mang : da chay ok
	 * phan tich : vd tao giong file dsKhoa.json trong package 
	 *   viet tu trong ra ngoai nhe 
	 *   + tao n doi tuong doi voi cac value la mang
	 *   + tao mang de chua n doi tuong do va add chung vao
	 *   + tao doi tuong cha ( vd la dsKh trong file dsKhoa.json) xong put mang tao ben tren vao doi tuong cha
	 *   + ghi ra tap tin
	 *   ==> write -> tu value ra ngoai
	 */
	JSONObject sJsonObject1 = new JSONObject();
	JSONObject sJsonObject2 = new JSONObject();
	JSONObject sJsonObject3 = new JSONObject();
	JSONObject sJsonObject4 = new JSONObject();
	sJsonObject1.put("maKH", "java");
	sJsonObject1.put("tenKH", "CNTT");
	sJsonObject2.put("maKH", "python");
	sJsonObject2.put("tenKH", "CNTT");
	sJsonObject3.put("maKH", ".Net");
	sJsonObject3.put("tenKH", "CNTT");
	sJsonObject4.put("maKH", "AV");
	sJsonObject4.put("tenKH", "NgoaiNgu");
	JSONArray arrayParent = new JSONArray();
	arrayParent.add(sJsonObject1);
	arrayParent.add(sJsonObject2);
	arrayParent.add(sJsonObject3);
	arrayParent.add(sJsonObject4);
	JSONObject jsonObjectParent = new JSONObject();
	jsonObjectParent.put("dsKH", arrayParent);
	FileWriter fileWriter2 = new FileWriter("wf_dsKHoa.json");
	fileWriter2.write(jsonObjectParent.toJSONString());
	fileWriter2.close();
			
}
}
