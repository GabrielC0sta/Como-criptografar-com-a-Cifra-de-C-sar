def criptografar(mensagem, chave):
    mensagem_criptografada = ""
    for letra in mensagem:
        if letra.isalpha():  # Verifica se o caractere é uma letra
            if letra.isupper():  # Verifica se a letra é maiúscula
                # Criptografa a letra maiúscula utilizando a cifra de César
                nova_letra = chr((ord(letra) - ord('A') + chave) % 26 + ord('A'))
            else:
                # Criptografa a letra minúscula utilizando a cifra de César
                nova_letra = chr((ord(letra) - ord('a') + chave) % 26 + ord('a'))
        else:
            # Mantém o caractere original se não for uma letra
            nova_letra = letra
        mensagem_criptografada += nova_letra
    return mensagem_criptografada

def descriptografar(mensagem_criptografada, chave):
    mensagem_descriptografada = ""
    for letra in mensagem_criptografada:
        if letra.isalpha():  # Verifica se o caractere é uma letra
            if letra.isupper():  # Verifica se a letra é maiúscula
                # Descriptografa a letra maiúscula utilizando a cifra de César
                nova_letra = chr((ord(letra) - ord('A') - chave + 26) % 26 + ord('A'))
            else:
                # Descriptografa a letra minúscula utilizando a cifra de César
                nova_letra = chr((ord(letra) - ord('a') - chave + 26) % 26 + ord('a'))
        else:
            # Mantém o caractere original se não for uma letra
            nova_letra = letra
        mensagem_descriptografada += nova_letra
    return mensagem_descriptografada

# Exemplo de uso
mensagem = "SEGURANÇA"
chave = 3

mensagem_criptografada = criptografar(mensagem, chave)
print("Mensagem criptografada:", mensagem_criptografada)

mensagem_descriptografada = descriptografar(mensagem_criptografada, chave)
print("Mensagem descriptografada:", mensagem_descriptografada)

palavra = "MARIAS"
outra_chave = 4

palavra_criptografada = criptografar(palavra, outra_chave)
print("Palavra criptografada:", palavra_criptografada)

palavra_descriptografada = descriptografar(palavra_criptografada, outra_chave)
print("Palavra descriptografada:", palavra_descriptografada)
