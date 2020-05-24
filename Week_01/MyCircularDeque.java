package com.company.oneWeek.operation;

/**
 * 设计队列
 */
public class MyCircularDeque {

    // 1、不用设计成动态数组，使用静态数组即可
    // 2、设计 head 和 tail 指针变量
    // 3、head == tail 成立的时候表示队列为空
    // 4、tail + 1 == head

    private int capacity;
    private int [] arr;
    private int front;
    private int rear;

    /**
     *  在此初始化您的数据结构。 将双端队列的大小设置为k。
     * @param k
     */
     public MyCircularDeque(int k){
         capacity = k + 1;
         arr = new int [capacity];
         // 头部指向第 1 个存放元素的位置
         // 插入时，先减，再赋值
         // 删除时，索引 +1（注意取模）
         front = 0;
         // 尾部指向下一个插入元素的位置
         // 插入时，先赋值，再加
         // 删除时，索引 -1（注意取模）
         rear = 0;

     }

    /**
     *  在Deque的背面添加一个项。 如果操作成功，则返回true
     * @param value
     * @return
     */
     public boolean insertFront(int value){
         if(isFull()){
             return false;
         }
         arr[rear] = value;
         rear = (rear + 1) % capacity;
         return true;
     }

    /**
     *  从Deque的前面删除一个项。 如果操作成功，则返回true。
     * @return
     */
     public boolean deleteFront(){
         if(isEmpty()){
            return false;
         }
         front= (front+1) % capacity;
         return true;
     }

    /**
     *  从Deque的背面删除一个项。 如果操作成功，则返回true
     * @return
     */
     public boolean deleteLast(){
         if(isEmpty()){
             return false;
         }
         rear = (rear- 1 + capacity) % capacity;
         return true;
     }

    /**
     *  从双端队列中获取前项。
     * @return
     */
     public int getFront(){
         if(isEmpty()){
             return -1;
         }
         return arr[front];
     }

    /**
     *  从双端队列中获取最后一个项
     * @return
     */
     public int getRear(){
         if (isEmpty()){
             return -1;
         }
         return arr[(rear -1 + capacity) % capacity];
     }

    /**
     *  检查圆形双端队列是否为空
     * @return
     */
     public boolean isEmpty(){
         return front == rear;
     }

    /**
     *  检查圆形双端队列是否已满
     * @return
     */
    private boolean isFull() {

         return (rear+1) % capacity == front;
    }
}
