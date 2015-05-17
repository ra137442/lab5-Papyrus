/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuário</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Usuário#getFormulario <em>Formulario</em>}</li>
 *   <li>{@link model.Usuário#getNome <em>Nome</em>}</li>
 *   <li>{@link model.Usuário#getEmail <em>Email</em>}</li>
 *   <li>{@link model.Usuário#getEndereco <em>Endereco</em>}</li>
 *   <li>{@link model.Usuário#getCep <em>Cep</em>}</li>
 *   <li>{@link model.Usuário#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link model.Usuário#getSobrenome <em>Sobrenome</em>}</li>
 *   <li>{@link model.Usuário#getCpf <em>Cpf</em>}</li>
 *   <li>{@link model.Usuário#getPhone <em>Phone</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getUsuário()
 * @model
 * @generated
 */
public interface Usuário extends EObject {
	/**
	 * Returns the value of the '<em><b>Formulario</b></em>' reference list.
	 * The list contents are of type {@link model.Formulario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulario</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulario</em>' reference list.
	 * @see model.ModelPackage#getUsuário_Formulario()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Formulario> getFormulario();

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
	 * @see model.ModelPackage#getUsuário_Nome()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link model.Usuário#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see model.ModelPackage#getUsuário_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link model.Usuário#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Endereco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endereco</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endereco</em>' attribute.
	 * @see #setEndereco(String)
	 * @see model.ModelPackage#getUsuário_Endereco()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEndereco();

	/**
	 * Sets the value of the '{@link model.Usuário#getEndereco <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endereco</em>' attribute.
	 * @see #getEndereco()
	 * @generated
	 */
	void setEndereco(String value);

	/**
	 * Returns the value of the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cep</em>' attribute.
	 * @see #setCep(String)
	 * @see model.ModelPackage#getUsuário_Cep()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCep();

	/**
	 * Sets the value of the '{@link model.Usuário#getCep <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cep</em>' attribute.
	 * @see #getCep()
	 * @generated
	 */
	void setCep(String value);

	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see model.ModelPackage#getUsuário_Titulo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link model.Usuário#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sobrenome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sobrenome</em>' attribute.
	 * @see #setSobrenome(String)
	 * @see model.ModelPackage#getUsuário_Sobrenome()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSobrenome();

	/**
	 * Sets the value of the '{@link model.Usuário#getSobrenome <em>Sobrenome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sobrenome</em>' attribute.
	 * @see #getSobrenome()
	 * @generated
	 */
	void setSobrenome(String value);

	/**
	 * Returns the value of the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpf</em>' attribute.
	 * @see #setCpf(String)
	 * @see model.ModelPackage#getUsuário_Cpf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCpf();

	/**
	 * Sets the value of the '{@link model.Usuário#getCpf <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpf</em>' attribute.
	 * @see #getCpf()
	 * @generated
	 */
	void setCpf(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see model.ModelPackage#getUsuário_Phone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link model.Usuário#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void PreencheFormulario();

} // Usuário
