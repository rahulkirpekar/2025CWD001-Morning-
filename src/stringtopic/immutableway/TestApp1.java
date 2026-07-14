package stringtopic.immutableway;

public class TestApp1 
{
				SOP(name1==name2);// true                     SOP(name1.equals(name2));//  
				SOP(name1==name3);// false                    SOP(name1.equals(name3));//  
				SOP(name1==name4);// true                     SOP(name1.equals(name4));//  
				SOP(name1==name5);// false                    SOP(name1.equals(name5));//  
				SOP(name1==name6);// false                    SOP(name1.equals(name6));//  
				SOP(name1==name7);// false                    SOP(name1.equals(name7));//  
				SOP(name2==name3);// false                    SOP(name2.equals(name3));//  
				SOP(name2==name4);// true                     SOP(name2.equals(name4));//  
				SOP(name2==name5);// false                    SOP(name2.equals(name5));//  
				SOP(name2==name6);// false                    SOP(name2.equals(name6));//  
				SOP(name2==name7);// false                    SOP(name2.equals(name7));//  
				SOP(name3==name4);// false                    SOP(name3.equals(name4));//  
				SOP(name3==name5);// true                     SOP(name3.equals(name5));//  
				SOP(name3==name6);// false                    SOP(name3.equals(name6));//  
				SOP(name3==name7);// false                    SOP(name3.equals(name7));//  
				SOP(name4==name5);// false                    SOP(name4.equals(name5));//  
				SOP(name4==name6);// false                    SOP(name4.equals(name6));//  
				SOP(name4==name7);// false                    SOP(name4.equals(name7));//  
				SOP(name5==name6);// false                    SOP(name5.equals(name6));//  
				SOP(name5==name7);// false                    SOP(name5.equals(name7));//  
				SOP(name6==name7);// true	                  SOP(name6.equals(name7));// 

}
