public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada agenda = new ListaDuplamenteEncadeada();

        agenda.adicionar(new Contato("Iara", "Rua Alencar B.", "87483974"));
        agenda.adicionar(new Contato("Geovana", "Rua Castelo L.", "94839755"));
        agenda.adicionar(new Contato("Davy", "Rua Lima N.", "94839759"));
        agenda.adicionar(new Contato("Matheus", "Rua Nunes S.", "94832755"));
        agenda.adicionar(new Contato("Derek", "Rua Belas V.", "94374834"));
        
        System.out.println("lista de contatos:");
        agenda.listarContatos();

        System.out.println("\nremovendo Geovana...");
        agenda.removerPorNome("Geovana");

        System.out.println("\nlista atualizada:");
        agenda.listarContatos();

        System.out.println("\npesquisando por Derek:");
        System.out.println(agenda.pesquisarPorNome("Derek"));
    }
}