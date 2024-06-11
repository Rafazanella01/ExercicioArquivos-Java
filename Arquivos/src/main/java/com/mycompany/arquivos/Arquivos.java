package com.mycompany.arquivos;

import java.io.IOException;

/**
 *
 * @author rafaz
 */
public class Arquivos {

    public static void main(String[] args) {

           ManipuladorArquivo arq = new ManipuladorArquivo();
           
           String diretorio = "C:\\Users\\rafaz\\OneDrive\\Área de Trabalho\\Unisc\\Fábrica de Software\\ExercicioArquivos-Java\\Arquivos\\src\\main\\java\\com\\mycompany\\arquivos\\arquivo.txt";
                   
        try {
            arq.escritor(diretorio);
            arq.leitor(diretorio);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
