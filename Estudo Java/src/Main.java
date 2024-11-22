public class Main {
    public  static void  main(String[] args) {

        Carro meuCarro = new Carro();

        meuCarro.setModelo("Fusca");
        meuCarro.setAno(1985);
        meuCarro.setCor("Azul");

        meuCarro.ligar();
        System.out.println("Modelo:"+meuCarro.getModelo());
        System.out.println("Ano:" + meuCarro.getAno());
        System.out.println("Cor:" + meuCarro.getCor());
        meuCarro.desligar();


//        Caminhao meuCaminhao = new Caminhao();
//
//        meuCaminhao.modelo = "Scania";
//        meuCaminhao.ano = 2022;
//        meuCaminhao.cor = "verde";
//
//        meuCaminhao.ligar();
//        meuCaminhao.carregarCarga();
//        meuCaminhao.desligar();

        Veiculo minhaMoto = new Moto();
        Veiculo meuCaminhao = new Caminhao();

        minhaMoto.modelo = "Hornet";
        meuCaminhao.modelo = "Scania";

        testarVeiculo(minhaMoto);

        public static void testarVeiculo(Veiculo veiculo) {
            veiculo.ligar();
        };
    }
}
