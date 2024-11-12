import java.util.Scanner;
class BinarySearch {
public static void main(String args[]) {
int n, i, num, first, last, middle;
int[] a = new int[20];
Scanner s = new Scanner(System.in);
System.out.println("Enter total number of elements (max 20):");
n = s.nextInt();
if (n > 20 || n <= 0) {
System.out.println("Please enter a valid number of elements (1-20).");
return;
}
System.out.println("Enter elements in sorted order:");
for (i = 0; i < n; i++) {
a[i] = s.nextInt();
}
System.out.println("Enter the search value:");
num = s.nextInt();
first = 0;
last = n - 1;
boolean found = false;
while (first <= last) {
middle = (first + last) / 2;
if (a[middle] < num) {
first = middle + 1;
} else if (a[middle] == num) {
System.out.println("Number found at index: " + middle + " (Position: " +
(middle + 1) + ")");
found = true;
break;
} else {
last = middle - 1;
}
}
if (!found) {
System.out.println("Number is not found");
}
s.close();
}
}
