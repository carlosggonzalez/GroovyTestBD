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

package es.test;

public class Constantes {

	protected static String JDBC_DRIVER = "org.postgresql.Driver";
	
	protected static String JDBC_URL = "jdbc:postgresql://localhost:5432/GroovyTest";
	
	protected static String DROP =  "DROP TABLE IF EXISTS  person";
	
	protected static String TABLE = "CREATE TABLE \"person\" "+
							"("+
							 " id integer NOT NULL,"+
							 " \"name\" character varying(30),"+
							 " gender character(1),"+
							 " CONSTRAINT pk PRIMARY KEY (id) "+
							 ")";

	protected static String INSERT = "INSERT INTO person(id,name,gender)  VALUES (?,?,?)";

	protected static String FEMALES = "SELECT * FROM person WHERE gender = 'F'";
	
	protected static String UPDATE = "UPDATE person SET name=? WHERE id=?";
}
