package Interfaces;

public interface IBase<T, I> {
	public void fechar() throws Exception;
	public void inserir(T objeto) throws Exception;
	public void alterar(T objeto)throws Exception;
	public void remover(T classe, I pk)throws Exception;
}
