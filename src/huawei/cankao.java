package huawei;



public class cankao {
    /*
    部分代码
Arrays.sort(arr)
list = Arrays.asList(1,2,3)

return new String(char[] ss)

java.lang.Character.isLetterOrDigit(int codePoint) 确定指定字符(Unicode代码点)是一个字母或数字。
字符被确定是字母或数字，如果不是isLetter(codePoint) 也不是 isDigit(codePoint) 的字符，则返回true。

自动增长的对象数组。
使用ArrayList即可。
ArrayList<Integer> al = new ArrayList<Integer>();
al.add(nums[i]);
al.get(i);
al.size()

优先级队列
在实例化PriorityQueue时，可以在构造函数中提供比较器。
 然后队列中的项目顺序将根据提供的比较器来决定。
如果没有提供比较器，则将使用Collection的自然顺序（Comparable）来排序元素。


PriorityQueue<String> priorityQueue = new PriorityQueue<String>(10, queueComparator);
add()
size()

1.开始
public class huawei.Main{
	publci static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    String line = s.nextLine();//nextLine()方法时，不将空格看做是两个字符串的间隔，而是看作字符串的一部分 到回车才结束，
	    //next()到空白就结束
	    String[] strs = line.split(" ");
	    System.out.print(strs[strs.length-1].length());
	}
}


nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。

next（）会自动消去有效字符前的空格，只返回输入的字符，不能得到带空格的字符串。
2.输入多行
	Scanner sr = new Scanner(System.in);
    while(sr.hasNext()) {}

    //int n = sc.nextInt();
    for(int i=0;i<n;i++){
        set.add(sc.nextInt());
    }


2.2
n行m列 字符输入-》数组
 int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] str = new char[n][m];
        for(int i = 0; i<n;i++){
            String s = sc.next();
            str[i] = s.toCharArray();
        }



3.“去重”与“排序”
TreeSet 是一个有序的集合，它的作用是提供有序的Set集合 基于TreeMap实现 升序
Set<Integer> set=new TreeSet<Integer>();

for(int i=0;i<n;i++){
    set.add(sc.nextInt());
}

遍历 for(Iterator iter = set.iterator(); iter.hasNext(); ) {
    iter.next();
}


4. 读入m行n列的字符矩阵
int x=in.nextInt();
int y=in.nextInt();

char[][] points=new char[x][y];
int[][] tar=new int[x][y];
for(int i=0;i<x;i++){
    String str=in.next();
    points[i]=str.toCharArray();
}
5.读入m行n列
for (i = 0; i < m; i++) {
    for (j = 0; j < n; j++) {
        a[i][j] = in.nextInt();
    }
}

6. //字符串切换大小写
str.toLowerCase()
str.toUpperCase()

7. //字符串 字符数组转换
str.toCharArray(); 字符串->字符
str.charAt(index)字符串中某位置字符
String.valueOf(c) 字符->字符串


String.valueOf(boolean b) : 将 boolean 变量 b 转换成字符串
String.valueOf(char c) : 将 char 变量 c 转换成字符串
String.valueOf(char[] data) : 将 char 数组 data 转换成字符串

8.切片
str.substring(int beginIndex, int endIndex)  //取得的字符串长度为：endIndex - beginIndex;
不包括endIndex位置的字符
substring(x)是从字符串的的第x个字符截取


9. 进制转换  Integer.parseInt(str,16)

10. 幂次 Math.pow(a,b)
a^b

11.Java 中int、String的类型转换

int -> String
  第一种方法：s=i+"";   //会产生两个String对象
  第二种方法：s=String.valueOf(i); //直接使用String类的静态方法，只产生一个对象
String -> int
  第一种方法：i=Integer.parseInt(s);//直接使用静态方法，不会产生多余的对象，但会抛出异常
  第二种方法：i=Integer.valueOf(s).intValue();//Integer.valueOf(s) 相当于 new

12. Set:注重独一无二的性质,该体系集合可以知道某物是否已近存在于集合中,不会存储重复的元素
用于存储无序(存入和取出的顺序不一定相同)元素，值不能重复
HashSet hs = new HashSet();
HashSet<String> hs = new HashSet<String>();
12.1
Set<Character> st = new LinkedHashSet<Character>();
//LinkedHashSet中的元素顺序是可以保证的，也就是说遍历序和插入序是一致的。
hs.add();
hs.size();
hs.clear();

for循环遍历
String result = "";
for (Character c : st) {
    result += c + "";
}
System.out.println(result);

迭代便利：
Iterator<> it = hs.iterator();
while (it.hasNext()) {
	System.out.println(it.next());
}

13.开方：(int)Math.sqrt(n);
(long)Math.pow(h,0.5);

15. TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();  键和值一一映射
map.put(k,v)
map.get(k)
map.containsKey(k)

getOrDefault(Object key, V defaultValue)
当Map集合中有这个key时，就使用这个key值，如果没有就使用默认值defaultValue
for (int d : nums1) {
     Count.put(d, Count.getOrDefault(d, 0) + 1);
}


Map.Entry 是Map中的一个接口，他的用途是表示一个映射项（里面有Key和Value）
Map.Entry<k,v>
// TreeMap中所有的元素都保持着某种固定的顺序HashMap中元素的排列顺序是不固定的。
for (Integer key : map.keySet()) {//此映射中包含的键的 Set 视图
    System.out.println(key + " " + map.get(key));
}

set.toArray(arr);

14. perm用来存模糊数字的全排列
            List<ArrayList<Integer>> perm = new ArrayList<ArrayList<Integer>>();

            //计算perm
            calperm(perm, list, 0);

//计算全排列
    public static void calperm(List<ArrayList<Integer>> perm , ArrayList<Integer> list, int n){
        if(n == list.size()){
            perm.add(new ArrayList<Integer>(list));
        }else{
            for(int i=n;i<list.size();i++){
                Collections.swap(list, i, n);
                calperm(perm, list, n+1);
                Collections.swap(list, i, n);
            }
        }
    }
}


20.字典序排列
Arrays.sort(String)

21.以非字母符号分割
split("[^a-zA-Z]+")

22.ip to 十进制
private static long IptoTen(String ip) {
        String[] arr=ip.split("\\.");
        long n=Long.parseLong(arr[0]);

        for(int i=1;i<arr.length;i++){
            n=n<<8;
            n=n+Long.parseLong(arr[i]);
        }

        return n;
    }
23.字符数组排序//按照ascii
char[] cs = str.toCharArray();
Arrays.sort(cs);


21.字符串倒序输出
StringBuffer sb =new StringBuffer("abcd");
System.out.println(sb.reverse().toString());



23.最长递增子序列

// 转化成求最长递增子序列
    public static int getMaxSteps(int [] arr ,int n) {
        int [] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                 if (arr[j]<arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        // 找到dp数组中的最大值即可
        int max = 0;
        for (int i = 0; i < dp.length; i++)
            if (dp[i]>max) {
                max = dp[i];
            }
        return max;
    }

    24. 比较器
    Array.sort(a);
    Array.sort(a,MyComparator);

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1.intValue()<o2.intValue())
            return 1;
        else if(o1.intValue()==o2.intValue())
            return 0;
        else
            return -1;
    }

     */
}
