package teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ecommece.Carrinho;
import ecommece.Frete;
import ecommece.FreteCorreio;
import ecommece.Livro;
import ecommece.Produto;
import ecommece.TipoFrete;

public class TesteCarrinho {

	public static void main(String[] args) {
		
		// Cria objeto Carriho
		Carrinho carrinho = new Carrinho();
		carrinho.setData( new Date() );
		carrinho.setFrete( TipoFrete.TRANSPORTADORA );
		
		// Produto1
		Livro livro1 = new Livro("Game of Thrones", "John Snow não é um bastardo", 75);
		livro1.setAutor("George R. R. Martin");
		livro1.setEditora("Bantam Spetra");
		livro1.setQuantidade(2);
		livro1.setPaginas("724");
		livro1.setDataPublicacao("06/08/1996");
		
		carrinho.adicionarProduto( livro1 );
		
		// Produto2
		Livro livro2 = new Livro("A Arte Da Guerra", "A  Arte da Guerra, é um tratado militar escrito durante o século IV a.C. pelo estrategista conhecido como Sun Tzu", 25);
		livro2.setAutor("Sun Tzu");
		livro2.setEditora("Sunzi");
		livro2.setQuantidade(3);
		livro2.setPaginas("104");
		livro2.setDataPublicacao("08/12/1772");
		
		carrinho.adicionarProduto( livro2 );

		System.out.println("|*****************************************************|");
		System.out.println("|* Valor dos produtos:" + carrinho.getValorCarrinho());
		System.out.println("|* Valor do frete:" + carrinho.getValorFrete());
		System.out.println("|* Valor Total da Compra:" + carrinho.getValorCarrinhoComFrete());
		System.out.println("|*****************************************************|");
		
		
	}
	
}
