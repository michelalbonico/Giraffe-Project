/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudType <em>Cloud Type</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudAddress <em>Cloud Address</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudCredential <em>Cloud Credential</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudOptionalTypes <em>Cloud Optional Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCloudProvider()
 * @model
 * @generated
 */
public interface CloudProvider extends Type
{
  /**
   * Returns the value of the '<em><b>Cloud Type</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cloud Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cloud Type</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCloudProvider_CloudType()
   * @model containment="true"
   * @generated
   */
  EList<CloudType> getCloudType();

  /**
   * Returns the value of the '<em><b>Cloud Address</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cloud Address</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cloud Address</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCloudProvider_CloudAddress()
   * @model containment="true"
   * @generated
   */
  EList<MgmAddressType> getCloudAddress();

  /**
   * Returns the value of the '<em><b>Cloud Credential</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cloud Credential</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cloud Credential</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCloudProvider_CloudCredential()
   * @model containment="true"
   * @generated
   */
  EList<CloudCredentialType> getCloudCredential();

  /**
   * Returns the value of the '<em><b>Cloud Optional Types</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cloud Optional Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cloud Optional Types</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCloudProvider_CloudOptionalTypes()
   * @model containment="true"
   * @generated
   */
  EList<CloudOptionalTypes> getCloudOptionalTypes();

} // CloudProvider
