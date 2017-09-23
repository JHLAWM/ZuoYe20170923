/**   
* @Title: Mofeng.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @author 江洪亮
* @date 2017年9月23日 下午9:18:09
* @version V1.0
*/

/** 
* @ClassName: Mofeng
* @Description: 输出如图所示的6*6数字旋转方阵，希望编出N*N的数字旋转方阵4<=N<=10
* @author 江洪亮
* @date 2017年9月23日 下午9:18:09
* 
*/
public class Mofeng {
	package practice02;


	/*数字旋转方阵
	 */
	public class Homework { 
		    public static int N = 6;  
		    int [][] result = new int[N][N];  
		    public static void main(String[] args) {  
		        Homework homework=new Homework();  
		        homework.math(1, 0, N);  
		        homework.printResult();  
		    }  
		      
		    
		    public void math(int number, int begin, int size){  
		        if(size == 1){  
		            result[begin][begin] = number;  
		            return;  
		        }  
		          
		        if(size == 0){  
		            return;  
		        }  
		   
		        int i = begin;  
		        int j = begin;  
		        for(int k = 0; k < size - 1; k++){  
		            result[i][j] = number;  
		            number++;  
		            i++;  
		        }  
		          
		         
		        for(int k = 0; k < size - 1; k++){  
		            result[i][j] = number;  
		            number++;  
		            j++;  
		        }  
		          
		         
		        for(int k = 0; k < size - 1; k++){  
		            result[i][j] = number;  
		            number++;  
		            i--;  
		        }  
		          
		          
		        for(int k = 0; k < size - 1; k++){  
		            result[i][j] = number;  
		            number++;  
		            j--;  
		        }  
		          
		       
		        math(number, begin + 1, size - 2);  
		    }  	    
		    public void printResult(){  
		        for(int i = 0; i < N; i++){  
		            for(int j = 0; j < N; j++){  
		                System.out.print(result[i][j] + "   ");  
		                if(j == N - 1){  
		                    System.out.println();  
		                }  
		            }  
		        }  
		    }  
	}


}
