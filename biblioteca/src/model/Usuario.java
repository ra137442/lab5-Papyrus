/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Usuario#getEmprestimo <em>Emprestimo</em>}</li>
 *   <li>{@link model.Usuario#getNome <em>Nome</em>}</li>
 *   <li>{@link model.Usuario#getNumeroCadastro <em>Numero Cadastro</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Emprestimo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emprestimo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emprestimo</em>' reference.
	 * @see #setEmprestimo(Emprestimo)
	 * @see model.ModelPackage#getUsuario_Emprestimo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Emprestimo getEmprestimo();

	/**
	 * Sets the value of the '{@link model.Usuario#getEmprestimo <em>Emprestimo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emprestimo</em>' reference.
	 * @see #getEmprestimo()
	 * @generated
	 */
	void setEmprestimo(Emprestimo value);

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
	 * @see model.ModelPackage#getUsuario_Nome()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link model.Usuario#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Numero Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Cadastro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Cadastro</em>' attribute.
	 * @see #setNumeroCadastro(int)
	 * @see model.ModelPackage#getUsuario_NumeroCadastro()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumeroCadastro();

	/**
	 * Sets the value of the '{@link model.Usuario#getNumeroCadastro <em>Numero Cadastro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Cadastro</em>' attribute.
	 * @see #getNumeroCadastro()
	 * @generated
	 */
	void setNumeroCadastro(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void FazReserva();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CancelaReserva();

} // Usuario
