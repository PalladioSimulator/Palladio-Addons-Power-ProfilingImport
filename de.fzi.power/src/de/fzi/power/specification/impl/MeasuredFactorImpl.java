/**
 */
package de.fzi.power.specification.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;

import de.fzi.power.specification.MeasuredFactor;
import de.fzi.power.specification.SpecificationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Measured Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.fzi.power.specification.impl.MeasuredFactorImpl#getMetricType <em>Metric Type</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasuredFactorImpl extends ConsumptionFactorImpl implements MeasuredFactor {
    /**
     * The cached value of the '{@link #getMetricType() <em>Metric Type</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMetricType()
     * @generated
     * @ordered
     */
    protected NumericalBaseMetricDescription metricType;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MeasuredFactorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpecificationPackage.Literals.MEASURED_FACTOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumericalBaseMetricDescription getMetricType() {
        if (this.metricType != null && ((EObject) this.metricType).eIsProxy())
        {
            final InternalEObject oldMetricType = (InternalEObject) this.metricType;
            this.metricType = (NumericalBaseMetricDescription) this.eResolveProxy(oldMetricType);
            if (this.metricType != oldMetricType)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SpecificationPackage.MEASURED_FACTOR__METRIC_TYPE, oldMetricType, this.metricType));
                }
            }
        }
        return this.metricType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NumericalBaseMetricDescription basicGetMetricType() {
        return this.metricType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMetricType(final NumericalBaseMetricDescription newMetricType) {
        final NumericalBaseMetricDescription oldMetricType = this.metricType;
        this.metricType = newMetricType;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SpecificationPackage.MEASURED_FACTOR__METRIC_TYPE,
                    oldMetricType, this.metricType));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case SpecificationPackage.MEASURED_FACTOR__METRIC_TYPE:
            if (resolve) {
                return this.getMetricType();
            }
            return this.basicGetMetricType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case SpecificationPackage.MEASURED_FACTOR__METRIC_TYPE:
            this.setMetricType((NumericalBaseMetricDescription) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID)
        {
        case SpecificationPackage.MEASURED_FACTOR__METRIC_TYPE:
            this.setMetricType((NumericalBaseMetricDescription) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID)
        {
        case SpecificationPackage.MEASURED_FACTOR__METRIC_TYPE:
            return this.metricType != null;
        }
        return super.eIsSet(featureID);
    }

} // MeasuredFactorImpl
