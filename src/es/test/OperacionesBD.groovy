/*
 * Encoding: UTF-8 Cadena de comprobación de encoding: 'El veloz murciélago
 * hindú comía feliz cardillo y kiwi.' 'La cigüeña tocaba el saxofón detrás del
 * palenque de paja.'
 * 
 * @author Carlos G. Gonzalez <turntoplay<nospam>gmail.com>
 * 
 * @blog: http://cgonzalezblog.blogspot.com.es
 * 
 * @date 27/04/2013
 */

package es.test

import groovy.sql.Sql;


public class OperacionesBD {

	
	private Sql connection;

	
	public OperacionesBD(String urljdbc, String usuario, String password) {
		super();
		
		this.connection = Sql.newInstance(urljdbc,usuario,password,Constantes.JDBC_DRIVER);
		connection.execute(Constantes.DROP);
	}
	

	
	public void createTablePersons(){
		connection.execute(Constantes.TABLE);
	}
	 
	public void insertValueTest(){
		connection.execute(Constantes.INSERT,[1,'Carlos','M']);
		connection.execute(Constantes.INSERT,[2,'Juan','M']);
		connection.execute(Constantes.INSERT,[3,'María','F']);
		connection.execute(Constantes.INSERT,[4,'Elena','F']);
		connection.execute(Constantes.INSERT,[5,'Pedro','M']);
		connection.execute(Constantes.INSERT,[6,'Rosa','F']);
	}
	
	
	public void showFemales(){
		connection.eachRow(Constantes.FEMALES, {
										 println "id: ${it.id}, Nombre: ${it.name}"
										 } );
	}
	
	
	public List <Map<Integer,String>> getFemales(){
		List <Map> l = new LinkedList<Map>();
		connection.eachRow(Constantes.FEMALES, {
										 Map<Integer,String> m = new HashMap<Integer,String>();
										 m.put(it.id.toInteger(), it.name.toString());
										 l.add(m);
									 } );
		return l;
	}
	
	
	public void update(int id, String newName){
		connection.executeUpdate(Constantes.UPDATE, [newName,id]);
	}
	

}
