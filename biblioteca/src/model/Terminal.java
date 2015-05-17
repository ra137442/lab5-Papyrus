/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Terminal#getBiblioteca <em>Biblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends EObject {
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
	 * @see model.ModelPackage#getTerminal_Biblioteca()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Biblioteca getBiblioteca();

	/**
	 * Sets the value of the '{@link model.Terminal#getBiblioteca <em>Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biblioteca</em>' reference.
	 * @see #getBiblioteca()
	 * @generated
	 */
	void setBiblioteca(Biblioteca value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void MostraInfo();

} // Terminal
