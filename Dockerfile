FROM maven:latest
RUN mkdir /19470491.TongGiaHuy_420300154901.Nhom1
WORKDIR /19470491.TongGiaHuy_420300154901.Nhom1
COPY . .
CMD mvn spring-boot:run


