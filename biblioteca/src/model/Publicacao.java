/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publicacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Publicacao#getBiblioteca <em>Biblioteca</em>}</li>
 *   <li>{@link model.Publicacao#getNome <em>Nome</em>}</li>
 *   <li>{@link model.Publicacao#getAutor <em>Autor</em>}</li>
 *   <li>{@link model.Publicacao#getArea <em>Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getPublicacao()
 * @model
 * @generated
 */
public interface Publicacao extends EObject {
	/**
	 * Returns the value of the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biblioteca</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioteca</em>' reference.
	 * @see #setBiblioteca(Biblioteca)
	 * @see model.ModelPackage#getPublicacao_Biblioteca()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Biblioteca getBiblioteca();

	/**
	 * Sets the value of the '{@link model.Publicacao#getBiblioteca <em>Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biblioteca</em>' reference.
	 * @see #getBiblioteca()
	 * @generated
	 */
	void setBiblioteca(Biblioteca value);

	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see model.ModelPackage#getPublicacao_Nome()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link model.Publicacao#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autor</em>' attribute.
	 * @see #setAutor(String)
	 * @see model.ModelPackage#getPublicacao_Autor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAutor();

	/**
	 * Sets the value of the '{@link model.Publicacao#getAutor <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' attribute.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(String value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(String)
	 * @see model.ModelPackage#getPublicacao_Area()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getArea();

	/**
	 * Sets the value of the '{@link model.Publicacao#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(String value);

} // Publicacao
