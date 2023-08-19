class Test{
	public static void main(String[] args){
		float f=12.10f;
		boolean b=true;
		short s= 100;
		short p='c'+'a';
		final char x='c';//x++ will give ERROR.
		//short s=p+x;//ERROR :type cast to debugg.
		//System.out.println(s);
		System.out.println(x);
		System.out.println(p);
		System.out.println(s);
		System.out.print(f);
		System.out.println(b);
		float d=12.0f+10L;
		System.out.println(d);
		//float v=123/10;
		//int v=123/10;=12 int
		int v=(int)(123/10.0f);
		System.out.println(v);
		System.out.println(123/0.0);
		System.out.println(0/0.0f);//NaN=not a number.
		//System.out.println(true&&10/0>0);
		System.out.println(43&53);
		System.out.println(43|53);
		System.out.println(43^53);
		//byte ,short ,int,long.
		long e=10;
		char m='a';
		System.out.println(e&m);
		//new creates an object.
		String s1="hello";
		String s2=new String("hello");
		System.out.println(s1.equals(s2));

	}
}
