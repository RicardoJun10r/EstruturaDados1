package QuestaoTrintaNove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Pessoa;

public class QuestaoTrintaNoveResposta {
    
    private List<Pessoa> pessoas;

    private Scanner scan = new Scanner( System.in );

    private int opcao;

    public QuestaoTrintaNoveResposta()
    {
        this.pessoas = new ArrayList<Pessoa>();
        do {
            this.menu();
            System.out.print("Opção: [_]\b\b");
            this.opcao = this.scan.nextInt();
            this.scan.nextLine();
            this.processarOpcao(this.opcao);
        } while (this.opcao != 0);
        this.clean();
    }

    private void menu()
    {
        System.out.println("[1] - Criar\n[2] - Ler\n[3] - Atualizar\n[4] - Deletar\n[5] - Listar\n[0] - Sair");
    }

    private void processarOpcao(int opcao)
    {
        Pessoa pessoa = new Pessoa();
        String cpf;

        switch (opcao) {
            case 1:
                System.out.println("-----Criando-----");
                System.out.println("Nome:");
                pessoa.setNome(scan.nextLine());
                System.out.println("CPF:");
                pessoa.setCpf((scan.next()));
                System.out.println("Idade:");
                pessoa.setIdade((scan.nextInt()));
                System.out.println("Sexo [M] ou [F]:");
                pessoa.setSexo((scan.next().charAt(0)));
                System.out.println("Altura:");
                pessoa.setAltura(scan.nextDouble());
                System.out.println("Peso:");
                pessoa.setPeso(scan.nextDouble());
                pessoa.calcImc();
                System.out.println();
                System.out.println(this.create(pessoa));
                break;
            case 2:
                System.out.println("-----Buscar-----");
                System.out.println("Digite o CPF para buscar:");
                cpf = scan.next();
                System.out.println(this.read(cpf));
                break;
            case 3:
                System.out.println("-----Atualizar-----");
                System.out.println("Digite o CPF para atuaizar o cadastro:");
                cpf = scan.next();
                this.scan.nextLine();
                System.out.println("Nome:");
                pessoa.setNome(scan.nextLine());
                System.out.println("Idade:");
                pessoa.setIdade((scan.nextInt()));
                System.out.println("Sexo [M] ou [F]:");
                pessoa.setSexo((scan.next().charAt(0)));
                System.out.println("Altura:");
                pessoa.setAltura(scan.nextDouble());
                System.out.println("Peso:");
                pessoa.setPeso(scan.nextDouble());
                pessoa.setCpf(cpf);
                pessoa.calcImc();
                System.out.println();
                System.out.println(this.update(cpf, pessoa));
                break;
            case 4:
                System.out.println("-----Deletar-----");
                System.out.println("Digite o CPF para deletar:");
                cpf = scan.next();
                System.out.println(this.delete(cpf));
                break;
            case 5:
                System.out.println("Listando...");
                this.listar();
                break;
            case 0:
                System.out.println("saindo...");
                break;
            default:
                System.out.println("Opção desconhecida!");
                break;
        }
    }

    private String create(Pessoa pessoa)
    {
        this.pessoas.add(pessoa);
        return pessoa.toString() + " foi adicionada";
    }

    private String read(String cpf)
    {
        for(int i = 0; i < this.pessoas.size(); i++)
        {
            if(this.pessoas.get(i).getCpf().equals(cpf))
            {
                return this.pessoas.get(i).toString();
            }
        }
        return "\nnão encontrado!\n";
    }

    private String update(String cpf, Pessoa pessoa)
    {
        for(int i = 0; i < this.pessoas.size(); i++)
        {
            if(this.pessoas.get(i).getCpf().equals(cpf))
            {
                this.pessoas.set(i, pessoa);
                return "atualizado";
            }
        }
        return "\nnão encontrado!\n";
    }

    private String delete(String cpf)
    {
        for(int i = 0; i < this.pessoas.size(); i++)
        {
            if(this.pessoas.get(i).getCpf().equals(cpf))
            {
                this.pessoas.remove(i);
                return "deletado";
            }
        }
        return "\nnão encontrado!\n";
    }

    private void listar()
    {
        for(int i = 0; i < this.pessoas.size(); i++)
        {
            System.out.println(this.pessoas.get(i).toString());
        }
    }

    private void clean()
    {
        this.pessoas.clear();
    }

}
