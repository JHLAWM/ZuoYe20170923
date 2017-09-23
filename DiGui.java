/**   
* @Title: DiGui.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @author 江洪亮
* @date 2017年9月23日 下午6:34:46
* @version V1.0
*/

/** 
* @ClassName: DiGui
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 江洪亮
* @date 2017年9月23日 下午6:34:46
* 
*/
public class DiGui {

	/** 
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
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
	* @Description: TODO(这里用一句话描述这个方法的作用)
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
