/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcionario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Funcionario#getFuncao <em>Funcao</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getFuncionario()
 * @model
 * @generated
 */
public interface Funcionario extends Usuario {
	/**
	 * Returns the value of the '<em><b>Funcao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcao</em>' attribute.
	 * @see #setFuncao(String)
	 * @see model.ModelPackage#getFuncionario_Funcao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFuncao();

	/**
	 * Sets the value of the '{@link model.Funcionario#getFuncao <em>Funcao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcao</em>' attribute.
	 * @see #getFuncao()
	 * @generated
	 */
	void setFuncao(String value);

} // Funcionario
