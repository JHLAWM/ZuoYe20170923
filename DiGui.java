/**   
* @Title: DiGui.java
* @Package 
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ������
* @date 2017��9��23�� ����6:34:46
* @version V1.0
*/

/** 
* @ClassName: DiGui
* @Description: TODO(������һ�仰��������������)
* @author ������
* @date 2017��9��23�� ����6:34:46
* 
*/
public class DiGui {

	/** 
	* @Title: main
	* @Description: TODO(������һ�仰�����������������)
	* @param @param args
	* @return void
	* @throws 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XunHuan(1237);
	}
	/** 
	* @Title: XunHuan
	* @Description: TODO(������һ�仰�����������������)
	* @param 
	* @return void
	* @throws 
	*/ 
	public static void XunHuan(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
		if(a<=5000){
			a*=2;
			XunHuan(a);
			a/=2;
		}
		System.out.println(a);
		
	}
}
