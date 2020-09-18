package blinovtask.enumFunctionalInterface;
@FunctionalInterface
public interface ShapeService {
    double service (double ... param);
}
// например нужно вычислить площадь(service) или объем(service) или периметр(service) разных
// фигур с разными значениями сторон(param)