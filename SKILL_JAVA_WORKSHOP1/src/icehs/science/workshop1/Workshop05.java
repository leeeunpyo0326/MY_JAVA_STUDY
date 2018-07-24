package icehs.science.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� 5.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        
        System.out.print( "������ ������ �Է��ϼ��� : " );
        
        System.out.println( "==============================" );
        
        System.out.println( "������ 100�� �Դϴ�." );
    }
    
    public static double getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Double.parseDouble( inputString );
    }
}
