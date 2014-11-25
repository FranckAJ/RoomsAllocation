
public interface IFacadeRoomsAllocation {

	/**
	 * Apaga todos os dados do sistema.
	 */
	public void zerarSistema();

	/**
	 * Adiciona uma sala ao sistema. O usu�rio pode adicionar diferentes tipos
	 * de salas. Cada sala tem uma capacidade f�sica. Cada sala possui uma
	 * identifica��o �nica: abrevia��o do pr�dio seguido de um n�mero (Exemplo:
	 * CN-216).
	 *
	 * @param id
	 *            Identificador (unico) da Sala.
	 * @param capacidade
	 *            Capacidade da Sala.
	 * @param finalidade
	 *            Finalidade da Sala.
	 * @param tipo
	 *            Tipo da Sala.
	 * 
	 * @throws RoomsAllocationException
	 */
	public void adicionarSala(String id, int capacidade, String finalidade,
			String tipo) throws RoomsAllocationException;

	/**
	 * 
	 * Adiciona uma sala ao sistema. O usu�rio pode adicionar diferentes tipos
	 * de salas. Cada sala tem uma capacidade f�sica. Cada sala possui uma
	 * identifica��o �nica: abrevia��o do pr�dio seguido de um n�mero (Exemplo:
	 * CN-216). Algumas salas possuem apelidos (Exemplo: Audit�rio M�rio
	 * Toyotaro).
	 * 
	 * @param id
	 *            Identificador (unico) da Sala.
	 * @param capacidade
	 *            Capacidade da Sala.
	 * @param finalidade
	 *            Finalidade da Sala.
	 * @param tipo
	 *            Tipo da Sala.
	 * @param apelido
	 *            Apelido da sala.
	 * @throws RoomsAllocationException
	 */
	public void adicionarSala(String id, int capacidade, String finalidade,
			String tipo, String apelido) throws RoomsAllocationException;

	/**
	 * Adiciona uma sala ao sistema. O usu�rio pode adicionar diferentes tipos
	 * de salas. Cada sala tem uma capacidade f�sica. Cada sala possui uma
	 * identifica��o �nica: abrevia��o do pr�dio seguido de um n�mero (Exemplo:
	 * CN-216). Algumas salas possuem apelidos (Exemplo: Audit�rio M�rio
	 * Toyotaro).
	 *
	 * @param id
	 *            Identificador (unico) da Sala.
	 * @param capacidade
	 *            Capacidade da Sala.
	 * @param finalidade
	 *            Finalidade da Sala.
	 * @param tipo
	 *            Tipo da Sala.
	 * @param apelido
	 *            Apelido da sala.
	 * @param aberto
	 *            Indica se a sala esta aberta.
	 * 
	 * @throws RoomsAllocationException
	 */
	public void adicionarSala(String id, int capacidade, String finalidade,
			String tipo, String apelido, boolean aberto)
			throws RoomsAllocationException;

	/**
	 * Recupera e retorna um atributo da sala.
	 *
	 * @param idSala
	 *            Identificador da sala.
	 * @param atributo
	 *            Atributo a recuperar.
	 * @return O atributo buscado.
	 * 
	 * @throws RoomsAllocationException
	 */
	public String getAtributoSala(String idSala, String atributo)
			throws RoomsAllocationException;

	/**
	 * O usu�rio pode adicionar eventos ao sistema. Cada evento possui um nome,
	 * datas de inicio e fim, um nome para contato e um numero de repeti�oes
	 * semanais
	 * 
	 * @param id
	 *            Identificador (unico) do evento.
	 * @param nome
	 *            Nome do evento.
	 * @param inicio
	 *            Data de inicio do evento.
	 * @param fim
	 *            Data de fim do evento.
	 * @param area
	 *            Area do conhecimento a qual o evento pertence.
	 * @param contato
	 *            Contato do responsavel pelo evento.
	 * @param repeticoes
	 *            Numero de repeticoes do evento.
	 * @throws RoomsAllocationException
	 */
	public void adicionarEvento(String id, String nome, String inicio,
			String fim, String area, String contato, int repeticoes)
			throws RoomsAllocationException;

	/**
	 * O usu�rio pode adicionar eventos ao sistema. Cada evento possui um nome,
	 * datas de inicio e fim e um nome para contato.
	 * 
	 * @param id
	 *            Identificador (unico) do evento.
	 * @param nome
	 *            Nome do evento.
	 * @param inicio
	 *            Data de inicio do evento.
	 * @param fim
	 *            Data de fim do evento.
	 * @param area
	 *            Area do conhecimento a qual o evento pertence.
	 * @param contato
	 *            Contato do responsavel pelo evento.
	 * 
	 * @throws RoomsAllocationException
	 */
	public void adicionarEvento(String id, String nome, String inicio,
			String fim, String area, String contato)
			throws RoomsAllocationException;

	/**
	 * 
	 * Recupera e retorna um atributo de um evento.
	 * 
	 * @param idEvento
	 *            Identificador do evento.
	 * @param atributo
	 *            Atributo procurado.
	 * @return O atributo.
	 * 
	 * @throws RoomsAllocationException
	 */
	public Object getAtributoEvento(String idEvento, String atributo)
			throws RoomsAllocationException;

	/**
	 * Deve-se alocar uma sala para um evento (repetitivo ou n�o). O sistema
	 * deve informar as salas dispon�veis que satisfa�am as restri��es do
	 * evento.
	 * 
	 * @param idEvento
	 *            Identificador do evento.
	 * @param idSala
	 *            Identificador da sala onde o evento devera ocorrer.
	 * @throws RoomsAllocationException
	 */
	public void alocarEvento(String idEvento, String idSala)
			throws RoomsAllocationException;

	/**
	 * O usu�rio pode localizar um evento escalonado atrav�s do nome, contato,
	 * data etc.
	 * 
	 * @param atributo
	 *            Nome do atributo do evento (nome, contato, horario etc).
	 * @param valor
	 *            Valor do atributo do evento.
	 * @return O identificador do evento, se algum evento com esse atributo for
	 *         encontrado.
	 * @throws RoomsAllocationException
	 */
	public String localizarEvento(String atributo, String valor)
			throws RoomsAllocationException;

	/**
	 * Desaloca um evento previamente alocado para uma sala.
	 * 
	 * @param idEvento
	 *            Identificador do evento a desalocar.
	 * 
	 * @throws RoomsAllocationException
	 */
	public void desalocarEvento(String idEvento)
			throws RoomsAllocationException;

	/**
	 * O usu�rio pode cancelar um evento. Neste caso, o cancelamento remove o
	 * evento da base de dados e desvincula as poss�veis aloca��es previamente
	 * computadas.
	 * 
	 * @param idEvento
	 *            Identificador do evento a cancelar.
	 * @throws RoomsAllocationException
	 */
	public void cancelarEvento(String idEvento) throws RoomsAllocationException;

	/**
	 * O usu�rio pode remover salas do sistema. A remo�ao de uma sala tamb�m
	 * remove as poss�veis aloca��es que referem a mesma, mas n�o exclui os
	 * respectivos eventos da base de dados.
	 * 
	 * @param idSala
	 *            Identificador da sala.
	 * @throws RoomsAllocationException
	 */
	public void removerSala(String idSala) throws RoomsAllocationException;

}
