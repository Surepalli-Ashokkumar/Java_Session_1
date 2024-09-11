package com.cisco.demo;

public class AccessModifier {

	 public void methodPublic() 
	    {
			
			System.out.println("Public Method");
		}
		
		private void methodPrivate() 
		{
			System.out.println("Private Method");
		}
		
		void methodDefault() 
		{
			System.out.println("Default Method");
		}
		
		protected void methodProtected() 
		{
			System.out.println("Protected Method");
		}
		
		
		public static void main(String[] args) 
		{
			
			AccessModifier obj= new AccessModifier();
			
			obj.methodDefault();
			obj.methodPrivate();
			obj.methodProtected();
			obj.methodPublic();
			
		}

}
