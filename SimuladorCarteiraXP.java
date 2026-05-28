import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// --- PILAR DA POO: ENCAPSULAMENTO (Atributos privados com getters e setters) ---
class Ativo {
    private String ticker; // Ex: PETR4, VALE3
    private String nome;
    private double precoAtual;

    public Ativo(String ticker, String nome, double precoAtual) {
        this.ticker = ticker;
        this.nome = nome;
        this.precoAtual = precoAtual;
    }

    public String getTicker() { return ticker; }
    public String getNome() { return nome; }
    public double getPrecoAtual() { return precoAtual; }
    public void setPrecoAtual(double precoAtual) { this.precoAtual = precoAtual; }
}

class Investimento {
    private Ativo ativo;
    private int quantidade;

    public Investimento(Ativo ativo, int quantidade) {
        this.ativo = ativo;
        this.quantidade = quantityCalculated(quantidade);
    }

    private int quantityCalculated(int qte) {
        return qte < 0 ? 0 : qte;
    }

    public Ativo getAtivo() { return ativo; }
    public int getQuantidade() { return quantidade; }
    public void adicionarQuantidade(int qtd) { this.quantidade += qtd; }

    public double getValorTotal() {
        return this.quantidade * ativo.getPrecoAtual();
    }
}

// O nome da classe pública PRECISA ser igual ao nome do arquivo (SimuladorCarteiraXP)
public class SimuladorCarteiraXP {
    private static Map<String, Ativo> mercadoDeAtivos = new HashMap<>();
    private static List<Investimento> carteiraDoCliente = new ArrayList<>();

    public static void main(String[] args) {
        inicializarMercado();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=== BEM-VINDO AO SIMULADOR DE CARTEIRA XP ===");

        while (opcao != 3) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Ver Ativos Disponíveis e Comprar");
            System.out.println("2 - Ver Minha Carteira Consolida");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    mostrarMercado();
                    System.out.print("\nDigite o Ticker do ativo que quer comprar: ");
                    String ticker = scanner.nextLine().toUpperCase();

                    if (mercadoDeAtivos.containsKey(ticker)) {
                        System.out.print("Digite a quantidade de ações: ");
                        int qtd = Integer.parseInt(scanner.nextLine());
                        comprarAtivo(ticker, qtd);
                    } else {
                        System.out.println("Ativo não encontrado no mercado da XP.");
                    }
                    break;

                case 2:
                    exibirCarteira();
                    break;

                case 3:
                    System.out.println("Simulador encerrado. Bons investimentos!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    private static void inicializarMercado() {
        mercadoDeAtivos.put("XPBR31", new Ativo("XPBR31", "XP Inc. BDR", 125.50));
        mercadoDeAtivos.put("PETR4", new Ativo("PETR4", "Petrobras PN", 38.20));
        mercadoDeAtivos.put("VALE3", new Ativo("VALE3", "Vale ON", 62.90));
    }

    private static void mostrarMercado() {
        System.out.println("\n--- ATIVOS DISPONÍVEIS NA XP ---");
        mercadoDeAtivos.values().forEach(ativo ->
                System.out.println(ativo.getTicker() + " - " + ativo.getNome() + " | Preço: R$ " + ativo.getPrecoAtual())
        );
    }

    private static void comprarAtivo(String ticker, int qtd) {
        Ativo ativo = mercadoDeAtivos.get(ticker);

        boolean jaPossui = false;
        for (Investimento inv : carteiraDoCliente) {
            if (inv.getAtivo().getTicker().equals(ticker)) {
                inv.adicionarQuantidade(qtd);
                jaPossui = true;
                break;
            }
        }

        if (!jaPossui) {
            carteiraDoCliente.add(new Investimento(ativo, qtd));
        }
        System.out.println("Sucesso! " + qtd + " ações de " + ticker + " adicionadas à sua carteira.");
    }

    private static void exibirCarteira() {
        System.out.println("\n--- SUA CARTEIRA CONSOLIDADA XP ---");
        if (carteiraDoCliente.isEmpty()) {
            System.out.println("Sua carteira está vazia. Comece a investir!");
            return;
        }

        double totalGeral = 0;
        for (Investimento inv : carteiraDoCliente) {
            System.out.println("- " + inv.getAtivo().getTicker() + " | Qtd: " + inv.getQuantidade() + " | Total: R$ " + inv.getValorTotal());
            totalGeral += inv.getValorTotal();
        }
        System.out.println("------------------------------------");
        System.out.println("VALOR TOTAL PATRIMÔNIO: R$ " + totalGeral);
    }
}