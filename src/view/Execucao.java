package view;

import javax.swing.JOptionPane;

import model.Professor;


public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor();
		
		professor.setNome(JOptionPane.showInputDialog(null,"Nome:"));
		professor.setEndereco(JOptionPane.showInputDialog(null,"Endereço:"));
		professor.setBairro(JOptionPane.showInputDialog(null,"Bairro:"));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null,"CEP:")));
		professor.setCidade(JOptionPane.showInputDialog(null,"Cidade:"));
		professor.setEstado(JOptionPane.showInputDialog(null,"Estado:"));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null,"RG:")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null,"CPF:")));
		
		JOptionPane.showMessageDialog(null, "Nome: "+ professor.getNome()+"\nEndereço: "+professor.getEndereco()+"\nBairro: "+professor.getBairro()+"\nCEP: "+professor.getCep()+"\nCidade: "+professor.getCidade()+"\nEstado: "+professor.getEndereco()+"\nRG: "+professor.getRg()+"\nCPF: "+professor.getCpf());
		
	
	try {
		int dis = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas disciplinas você possui?"));
		String disciplinas[] = new String[100];
		for (int i = 0; i < dis; i++) {
			int r = i+1;
			disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina " + r);
		}
		for (int a = 0; a < dis  ;a++) {
			int c = a+1;
			JOptionPane.showMessageDialog(null,"Disciplina: "+c+": "+ disciplinas[a]);
		}
		professor.setDisciplinas(disciplinas);
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		int cur = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos cursos você possui?"));
		String cursos[] = new String[100];
		for (int i = 0; i < cur; i++) {
			int t = i+1;
			cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso " + t);
		}
		for (int b = 0; b < cur  ;b++) {
			int d = b+1;
			JOptionPane.showMessageDialog(null,"Curso "+d+": "+ cursos[b]);
		}
		professor.setCursos(cursos);
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}

