public class Personagem     {
   
    String nome;
    int energia;
    
        public Personagem (String nome, int energia) {
            this.nome = nome;
            this.energia = energia;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setEnergia(int energia) {
            this.energia = energia;
        }

        public void getEnergia (int energia) {
            this.energia = energia;

        }

        public int getEnergia() {
            return 0;
        }
    }
    