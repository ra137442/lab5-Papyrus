/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tese</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Tese#getOrientador <em>Orientador</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getTese()
 * @model
 * @generated
 */
public interface Tese extends Publicacao {
	/**
	 * Returns the value of the '<em><b>Orientador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientador</em>' attribute.
	 * @see #setOrientador(String)
	 * @see model.ModelPackage#getTese_Orientador()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getOrientador();

	/**
	 * Sets the value of the '{@link model.Tese#getOrientador <em>Orientador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientador</em>' attribute.
	 * @see #getOrientador()
	 * @generated
	 */
	void setOrientador(String value);

} // Tese
