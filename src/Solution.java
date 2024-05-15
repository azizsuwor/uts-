import javax.swing.JOptionPane;

public class Solution {

  public int solution(int number) {
    int sum = 0;
    
    for (int i = 3; i < number; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }
    
    return sum;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    
    // Meminta pengguna untuk memasukkan angka menggunakan JOption
    String input = JOptionPane.showInputDialog("Enter a number:");
    int number = Integer.parseInt(input);
    
    // Memanggil metode solution dan menampilkan hasilnya menggunakan JOption
    int result = solution.solution(number);
    JOptionPane.showMessageDialog(null, "Sum of multiples of 3 or 5 below " + number + " is: " + result);
  }
}
