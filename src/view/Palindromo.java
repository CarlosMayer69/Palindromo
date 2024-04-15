package view;

public class Palindromo {
	
    public static boolean isPalindrome(int[] array, int start, int end) {
        // Caso base: quando a recursão atingir o meio do vetor
        if (start >= end) {
            return true;
        }
        
        // Verifica se os elementos nas extremidades do vetor são iguais
        if (array[start] == array[end]) {
            // Chama recursivamente para verificar os elementos restantes
            return isPalindrome(array, start + 1, end - 1);
        } else {
            // Se os elementos não forem iguais, não é um palíndromo
            return false;
        }
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 2, 1}; // 6 elementos
        int[] vetor2 = {1, 2, 3, 2, 1};    // 5 elementos

        System.out.println("Vetor 1 é palíndromo? " + isPalindrome(vetor1, 0, vetor1.length - 1));
        System.out.println("Vetor 2 é palíndromo? " + isPalindrome(vetor2, 0, vetor2.length - 1));
    }
}

