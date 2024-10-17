class Solid
{
    public static void main(String[] args)
	{
        int i = 0;
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int e = 6;
            
        int j = (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                i-- + i++ + i-- + i + i++ + i-- + i + i++ + i-- + i + i++ + i;
        
        int k = ++i + --i + ++i + i +
                --i + i + --i + i +
                ++i + ++i + --i + i +
                --i + i + --i + i;
        System.out.println(i);
        System.out.println(j);
		System.out.println(j);
        System.out.println(j);
        System.out.println(j);
        System.out.println(j);
		System.out.println(k);
    }
}

