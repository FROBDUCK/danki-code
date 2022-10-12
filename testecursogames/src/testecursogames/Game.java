package testecursogames;

public class Game {
	public static void main(String[] args) {
		
		Player player = new Player();
		ElfInimigo elf = new ElfInimigo(10);
		
		elf.tomarDano();
		
		System.out.println(elf.getVida());
		}
	}


