package huawei;

public class paixu {
    /*
    算法笔记

一 排序
1.冒泡排序 O(N^2) 最好O(N) 最差O(N^2) 稳定
空间复杂度O(1)
public static void bubbleSort(int[] arr){
	if(arr==null || arr.length<2){
		return;
	}
	for(int end=arr.length-1;end>0;end--){
		for(int i=0;i<end;i++){
			if(arr[i]>arr[i+1]){
				swap(arr,i,i+1);
			}
		}
	}
}
2.选择排序 O(N^2) 最好O(N^2) 最差O(N^2) 不稳定
空间复杂度O(1)
public static void selectionSort(int[] arr){
	if(arr==null || arr.length<2){
		  return;
	}
	for(int i=o;i<arr.length-1;i++){
		int minIndex = i;
		for(int j=i+1;j<arr.length;j++){
			minIndex=arr[j]<arr[minIndex]?j:minIndex;
		}
		swap(arr,i,minIndex);
	}
}
3.插入排序 O(N^2) 最好O(N) 最差O(N^2) 稳定
空间复杂度O(1)
public static void insertionSort(int[] arr){
	if(arr==null || arr.length<2){
		  return;
	}
	for(int i=1;i<arr.length;i++){
		for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
			swap(arr,j,j+1);
		}
	}
}
4.归并排序 O(N*logN) 最好O(N*logN) 最差O(N*logN) 稳定
空间复杂度O(N)
public static void mergeSort(int[] arr){
	if(arr==null || arr.length<2){
		  return;
	}
	sortProcess(arr,0,arr.length-1);
}

public static void sortProcess(int[] arr,int L,int R){
	//递归过程
	if(L==R){
		return;
	}
	//int mid=(L+R)/2；
	int mid = L+((R-L)>>1);
	sortProcess(arr,L,mid);
	sortProcess(arr,mid+1,R);
	merge(arr,L,mid,R);
}

public static void merge(int[] arr,int L,int mid,int R){
	int[] help = new int[R-L+1];
	int i=0;
	int p1=L;
	int p2=mid+1;
	while(p1<=mid && p2<=R){
		help[i++] = arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
	}
	while(p1<=mid){
		help[i++]=arr[p1++];
	}
	while(p2<=R){
		help[i++]=arr[p2++];
	}
	for(i=0;i<help.length;i++){
		arr[L+i]=help[i];
	}
}

5.快速排序 O(N*logN) 最好O(N*logN) 最差O(N^2) 不稳定
空间复杂度O(logN)
public static void quickSort(int[] arr){
	if(arr==null || arr.length<2){
		  return;
	}
	quickSort(arr,0,arr.length-1);
}

public static void quickSort(int[] arr,int L,int R){
	if(L<R){
		swap(arr,L+(int)(Math.random()*(R-l+1)),R);
		int[] p=partition(arr,L,R);
		quickSort(arr,L,p[0]-1);
		quickSort(arr,p[1]+1,R);
	}
}

public static int[] partition(int[] arr,int L,int R){
	int less=L-1;
	int more=R;
	while(L<more){
		if(arr[L]<arr[R]){
			swap(arr,++less,L++);
		}else if(arr[L]>arr[R]){
			swap(arr,--more,L);
		}else{
			L++;
		}
	}
	swap(arr,more,R);
	return new int[] {less+1,more};
}

6.堆排序 O(N*logN) 最好O(N*logN) 最差O(N*logN)
空间复杂度O(1)
public static void heapSort(int[] arr){
	if(arr==null || arr.length<2){
		  return;
	}
	for(int i=0;i<arr.length;i++){
		heapInsert(arr,i);
	}
	int heapSize=arr.length;
	swap(arr,0,--heapSize);
	while(heapSize>0){
		heapify(arr,0,heapSize);
		swap(arr,0,--heapSize);
	}
}

public static void heapInsert(int[] arr,int index){
	while(arr[index]>arr[(index-1)/2]){
		swap(arr,index,(index-1)/2);
		index = (index-1)/2;
	}
}

public static void heapify(int[] arr,int index,int heapSize){
	int left=index*2+1;
	while(left<heapSize){
		int largest= left+1<heap && arr[left+1]>arr[left] ? left+1 : left;
		largest=arr[largest] > arr[left] ? largest : index;
		if(largest==index){
			break;
		}
		swap(arr,largest,index);
		index = largest;
		left = index*2+1;
	}
}

二 队列 栈 矩阵 链表


1.Queue<String> queue = new LinkedList<String>();
//添加元素  queue.offer("a");  //add()和remove()方法在失败的时候会抛出异常(不推荐)
poll()         移除并返问队列头部的元素
peek()       返回队列头部的元素

2.Stack<Integer> st = new Stack<Integer>();
isEmpty()
length()
peek()
clear()
pop()
push(Object x)

例题
.1 用数组结构实现大小固定的队列和栈
.2 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返 回栈中最小元素的操作。
   【要求】 1．pop、push、getMin操作的时间复杂度都是O(1)。 2．设计的栈类型可以使用现成的栈结构。
.3 如何仅用队列结构实现栈结构？
   如何仅用栈结构实现队列结构
.4 宠物、狗和猫的类如下：
	public class Pet {
		private String type;
		public Pet(String type) {
			this.type = type;
		}
		public String getPetType() {
			return this.type;
		}
	}
	public class Dog extends Pet {
		public Dog() {
			super("dog");
		}
	}
	public class Cat extends Pet {
		public Cat() {
			super("cat");
		}
	}
	实现一种狗猫队列的结构，要求如下：
	用户可以调用add方法将cat类或dog类的 实例放入队列中；
	用户可以调用pollAll方法，将队列中所有的实例按照进队列 的先后顺序依次弹出；
	用户可以调用pollDog方法，将队列中dog类的实例按照 进队列的先后顺序依次弹出；
	用户可以调用pollCat方法，将队列中cat类的实 例按照进队列的先后顺序依次弹出；
	用户可以调用isEmpty方法，检查队列中是 否还有dog或cat的实例；
	用户可以调用isDogEmpty方法，检查队列中是否有dog 类的实例；
	用户可以调用isCatEmpty方法，检查队列中是否有cat类的实例。
.5 转圈打印矩阵
	给定一个整型矩阵matrix，请按照转圈的方式打印它。
	例如： 	 1  2  3  4
			 5  6  7  8
			 9 10 11 12
			13 14 15 16
	打印结果为：1，2，3，4，8，12，16，15，14，13，9，5，6，7，11，10
	【要求】 额外空间复杂度为O(1)。
.6 旋转正方形矩阵
	给定一个整型正方形矩阵matrix，请把该矩阵调整成 顺时针旋转90度的样子。
	【要求】 额外空间复杂度为O(1)。
.7 反转单向和双向链表
	分别实现反转单向链表和反转双向链表的函数。
	【要求】 如果链表长度为N，时间复杂度要求为O(N)，额外空间 复杂度要求为O(1)
.8 “之”字形打印矩阵
	给定一个矩阵matrix，按照“之”字形的方式打印这个矩阵，
	例如： 	 1  2  3  4
			 5  6  7  8
			 9 10 11 12
	“之”字形打印的结果为：1，2，5，9，6，3，4，7，10，11，8，12
	【要求】 额外空间复杂度为O(1)。
.9 在行列都排好序的矩阵中找数
	给定一个有N*M的整型矩阵matrix和一个整数K， matrix的每一行和每一 列都是排好序的。实现一个函数，判断K 是否在matrix中。
	例如： 	0 1 2 5
	 		2 3 4 7
	 		4 4 4 8
	 		5 7 7 9
	如果K为7，返回true；如果K为6，返 回false。
	【要求】 时间复杂度为O(N+M)，额外空间复杂度为O(1)。
.10打印两个有序链表的公共部分
	给定两个有序链表的头指针head1和head2，打印两个链表的公共部分。
.11判断一个链表是否为回文结构
	给定一个链表的头节点head，请判断该链表是否为回 文结构。
	例如： 	1->2->1，返回true。 1->2->2->1，返回true。
			15->6->15，返回true。 1->2->3，返回false。
	进阶： 如果链表长度为N，时间复杂度达到O(N)，额外空间复杂度达到O(1)
.12将单向链表按某值划分成左边小、中间相等、右边大的形式
	给定一个单向链表的头节点head，节点的值类型是整型，再给定一个整数pivot。实现一个调整链表的函数，将链表调整为左部分都是值小于pivot的节点，中间部分都是值等于pivot的节点，右部分都是值大于pivot的节点。除这个要求外，对调整后的节点顺序没有更多的要求。
	例如：链表9->0->4->5>1，pivot=3。调整后链表可以是1->0->4->9->5，也可以是0->1->9->5->4。总之，满足左部分都是小于3的节点，中间部分都是等于3的节点（本例中这个部 分为空），右部分都是大于3的节点即可。对某部分内部的节点顺序不做要求。
	进阶： 在原问题的要求之上再增加如下两个要求。 在左、中、右三个部分的内部也做顺序要求，要求每部分里的节点从左到右的 顺序与原链表中节点的先后次序一致。
	例如：链表9->0->4->5->1，pivot=3。 调整后的链表是0->1->9->4->5。 在满足原问题要求的同时，左部分节点从左到右为0、1。在原链表中也是先出现0，后出现1；中间部分在本例中为空，不再讨论；右部分节点从左到右为9、4、5。在原链表中也是先出现9，然后出现4， 最后出现5。 如果链表长度为N，时间复杂度请达到O(N) 额外空间复杂度请达到O(1)。
.13复制含有随机指针节点的链表
	一种特殊的链表节点类描述如下：
	public class Node {
		public int value;
		public Node next;
		public Node rand;
		public Node(int data) {
			this.value = data;
		}
	}
	Node类中的value是节点值，next指针和正常单链表中next指针的意义一样，都指向下一个节点，rand指针是Node类中新增的指针，这个指针可能指向链表中的任意一个节点，也可能指向null。
	给定一个由 Node节点类型组成的无环单链表的头节点head，请实现一个函数完成这个链表中所有结构的复制，并返回复制的新链表的头节点。
	进阶： 不使用额外的数据结构，只用有限几个变量，且在时间复杂度为 O(N)内完成原问题要实现的函数。
.14两个单链表相交的一系列问题
	在本题中，单链表可能有环，也可能无环。给定两个单链表的头节点head1和head2，这两个链表可能相交，也可能不相交。
	请实现一个函数， 如果两个链表相交，请返回相交的第一个节点；
	如果不相交，返回null 即可。
	要求：如果链表1 的长度为N，链表2的长度为M，时间复杂度请达到 O(N+M)，额外空间复杂度请达到O(1)。

三 二叉树
.1 实现二叉树的先序、中序、后序遍历，包括递归方式和非递归方式
.2 在二叉树中找到一个节点的后继节点
	现在有一种新的二叉树节点类型如下：
	public class Node {
		public int value;
		public Node left;
		public Node right;
		public Node parent;
		public Node(int data) {
			this.value = data;
		}
	}
	该结构比普通二叉树节点结构多了一个指向父节点的parent指针。假设有一棵Node类型的节点组成的二叉树，树中每个节点的parent指针都正确地指向自己的父节点，头节点的parent指向null。只给一个在二叉树中的某个节点node，请实现返回node的后继节点的函数。在二叉树的中序遍历的序列中，node的下一个节点叫作node的后继节点
.3 介绍二叉树的序列化和反序列化
.3 折纸问题
	请把一段纸条竖着放在桌子上，然后从纸条的下边向上方对折1次，压出折痕后展开。此时 折痕是凹下去的，即折痕突起的方向指向纸条的背面。如果从纸条的下边向上方连续对折 2 次，压出折痕后展开，此时有三条折痕，从上到下依次是下折痕、下折痕和上折痕。 给定一 个输入参数N，代表纸条都从下边向上方连续对折N次， 请从上到下打印所有折痕的方向。 例如：N=1时，打印： down N=2时，打印： down down up
.4 判断一棵二叉树是否是平衡二叉树
.5 判断一棵树是否是搜索二叉树、判断一棵树是否是完全二叉树
.6 已知一棵完全二叉树，求其节点的个数
	要求：时间复杂度低于O(N)，N为这棵树的节点个数

四 哈希函数 哈希表
.1 认识哈希函数和哈希表
.2 设计RandomPool结构
	设计一种结构，在该结构中有如下三个功能：
	insert(key)：将某个key加入到该结构，做到不重复加入。
	delete(key)：将原本在结构中的某个key移除。
	getRandom()： 等概率随机返回结构中的任何一个key。
	【要求】 Insert、delete和getRandom方法的时间复杂度都是 O(1)
.3 布隆过滤器
.4 一致性哈希
.5 岛问题
	一个矩阵中只有0和1两种值，每个位置都可以和自己的上、下、左、右四个位置相连，如果有一片1连在一起，这个部分叫做一个岛，求一个 矩阵中有多少个岛？
	举例：
	0 0 1 0 1 0
	1 1 1 0 1 0
	1 0 0 1 0 0
	0 0 0 0 0 0
	这个矩阵中有三个岛
.6 并查集结构

五 前缀树 贪心策略
.1 前缀树
.2  给定一个字符串类型的数组strs，找到一种拼接方式，使得把所有字符串拼起来之后形成的字符串具有最低的字典序
.3 	一块金条切成两半，是需要花费和长度数值一样的铜板的。比如长度为20的金条，不管切成长度多大的两半，都要花费20个铜板。一群人想整分整块金条，怎么分最省铜板？例如,给定数组{10,20,30}，代表一共三个人，整块金条长度为10+20+30= 60. 金条要分成10,20,30三个部分。如果，先把长度60的金条分成10和50，花费60再把长度50的金条分成20和30，花费50一共花费110铜板。但是如果，先把长度60的金条分成30和30，花费60再把长度30 金条分成10和20，花费30一共花费90铜板。输入一个数组，返回分割的最小代价。
.4 一些项目要占用一个会议室宣讲，会议室不能同时容纳两个项目的宣讲。给你每一个项目开始的时间和结束的时间(给你一个数组，里面是一个个具体的项目)，你来安排宣讲的日程，要求会议室进行的宣讲的场次最多。返回这个最多的宣讲场次

六 递归和动态规划
  暴力递归：
	1.把问题转化为规模缩小了的同类问题的子问题
	2.有明确的不需要继续进行递归的条件
	3.有得到了子问题结果之后的决策过程
	4.不记录每一个子问题的解
  动态规划
	1.从暴力递归中来
	2.将每一个子问题的解记录下来，避免重复计算
	3.将暴力递归的过程抽象成状态表达
	4.存在化简状态表达，使其更加简洁
.1 求N!
.2 汉诺塔问题
.3 打印一个字符串的全部子序列，包括空字符串
.4 打印一个字符串的全部排列，不重复
.5 母牛问题
.6 给一个二维数组，每个数都是正数，要求从左上角走到右下角，每一步只能向右或向下。沿途经过的数字累加起来，求最小路径和。
.7 给一个数组arr，和一个整数aim，如果可以任意选择arr中的数字，能不能累加得到aim，返回true、false


树——>二叉树，大孩子变左孩子，兄弟变右孩子
因此对应的二叉树没有右孩子，说明该节点在树里右边没有兄弟，也就是说，该节点是其父节点最右边的孩子。有多少个有孩子的节点，就有多少个“最右的孩子节点”，因此2011-116=1895
此外，对于根节点而言，它没有父节点当然也没有兄弟，因此也是没有右孩子的。所以+1=1896
     */
}
