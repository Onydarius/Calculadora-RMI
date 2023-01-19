package com.ony.practicas;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServer extends UnicastRemoteObject implements IRemoteMethods{
    @Override
    public double AddRemote(double a, double b) throws RemoteException {
        return a + b;
    }
    @Override
    public double SubRemote(double a, double b) throws RemoteException {
        return a - b;
    }
    @Override
    public double MulRemote(double a, double b) throws RemoteException {
        return a * b;
    }
    @Override
    public double DivRemote(double a, double b) throws RemoteException {
        return a / b;
    }
}
