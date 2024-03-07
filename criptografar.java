public class criptografar {
    public static void main(String[] args) {
// Definindo a mensagem e a chave de criptografia
        String mensagem = "SEGURANÇA";
        int chave = 3;

        // Criptografando a mensagem
        String mensagemCriptografada = criptografar(mensagem, chave);
        System.out.println("Mensagem criptografada: " + mensagemCriptografada);

        // Descriptografando a mensagem criptografada
        String mensagemDescriptografada = descriptografar(mensagemCriptografada, chave);
        System.out.println("Mensagem descriptografada: " + mensagemDescriptografada);

        // Definindo a palavra e outra chave de criptografia
        String palavra = "MARIAS";
        int outraChave = 4;

        // Criptografando a palavra
        String palavraCriptografada = criptografar(palavra, outraChave);
        System.out.println("Palavra criptografada: " + palavraCriptografada);

        // Descriptografando a palavra criptografada
        String palavraDescriptografada = descriptografar(palavraCriptografada, outraChave);
        System.out.println("Palavra descriptografada: " + palavraDescriptografada);
    }

    // Método para criptografar uma mensagem
    public static String criptografar(String mensagem, int chave) {
        StringBuilder criptografada = new StringBuilder();
        for (int i = 0; i < mensagem.length(); i++) {
            char letra = mensagem.charAt(i);
            if (letra >= 'A' && letra <= 'Z') { // Verifica se o caractere é uma letra maiúscula
                // Criptografa a letra movendo-a por 'chave' posições no alfabeto
                char novaLetra = (char) ((letra - 'A' + chave) % 26 + 'A');
                criptografada.append(novaLetra);
            } else {
                criptografada.append(letra); // Se não for uma letra maiúscula, mantém o caractere original
            }
        }
        return criptografada.toString(); // Retorna a mensagem criptografada
    }

    // Método para descriptografar uma mensagem criptografada
    public static String descriptografar(String mensagemCriptografada, int chave) {
        StringBuilder descriptografada = new StringBuilder();
        for (int i = 0; i < mensagemCriptografada.length(); i++) {
            char letra = mensagemCriptografada.charAt(i);
            if (letra >= 'A' && letra <= 'Z') { // Verifica se o caractere é uma letra maiúscula
                // Descriptografa a letra movendo-a por '-chave' posições no alfabeto
                char novaLetra = (char) ((letra - 'A' - chave + 26) % 26 + 'A');
                descriptografada.append(novaLetra);
            } else {
                descriptografada.append(letra); // Se não for uma letra maiúscula, mantém o caractere original
            }
        }
        return descriptografada.toString(); // Retorna a mensagem descriptografada
    }
}
