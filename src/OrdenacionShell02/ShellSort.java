
package OrdenacionShell02;
//Jhosep TS

public class ShellSort {
private long[] data;
private int len;
public ShellSort(int max) {
data = new long[max];
len = 0;
}
public void insert(long value) {
data[len] = value;
len++;
}
public void display() {
for (int j = 0; j < len; j++) {
System.out.print(data[j] + " ");
}
System.out.println("");
}
public void shellSort() {
int inner, outer;
long temp;
int h = 1;
while (h <= len / 3) {
h = h * 3 + 1; 
}
while (h > 0) 
{
for (outer = h; outer < len; outer++) {
temp = data[outer];
inner = outer;
// one subpass (eg 0, 4, 8)
while (inner > h - 1 && data[inner - h] >= temp) {
data[inner] = data[inner - h];
inner -= h;
}
data[inner] = temp;
}
h = (h - 1) / 3; 
}
}
    public static void main(String[] args) {
       int maxSize = 10;
ShellSort arr = new ShellSort(maxSize);
for (int j = 0; j < maxSize; j++) {
long n = (int) (java.lang.Math.random() * 99);
arr.insert(n);
}
System.out.print("Unsorted List:\n");
arr.display();
arr.shellSort();
System.out.print("-------------------------\n");
System.out.print("Sorted List:\n");
arr.display(); 
    }
}
