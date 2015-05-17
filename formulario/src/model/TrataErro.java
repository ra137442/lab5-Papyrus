/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trata Erro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.TrataErro#getCodigoErro <em>Codigo Erro</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getTrataErro()
 * @model
 * @generated
 */
public interface TrataErro extends EObject {
	/**
	 * Returns the value of the '<em><b>Codigo Erro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Erro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Erro</em>' attribute.
	 * @see #setCodigoErro(int)
	 * @see model.ModelPackage#getTrataErro_CodigoErro()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCodigoErro();

	/**
	 * Sets the value of the '{@link model.TrataErro#getCodigoErro <em>Codigo Erro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Erro</em>' attribute.
	 * @see #getCodigoErro()
	 * @generated
	 */
	void setCodigoErro(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void MostraMensagem();

} // TrataErro
