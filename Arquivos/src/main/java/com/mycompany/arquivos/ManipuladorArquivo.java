package com.mycompany.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author rafaz
 */
public class ManipuladorArquivo {
    
    public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
                System.out.println("\nEste e o conteudo do arquivo: ");
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
            //Cria o arquivo se ele não existir
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            //Escreve no arquivo
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(file, true)); // O segundo argumento true adiciona texto ao arquivo existente
            Scanner in = new Scanner(System.in);
            System.out.println("Escreva algo: ");
            String linha = in.nextLine();
            buffWrite.append(linha + "\n");
            buffWrite.close();
            in.close();
	}
}
