import { Text, View } from 'react-native';
import React, { useState } from "react";
import { Center, Box, Heading, VStack, NativeBaseProvider, Button } from "native-base";



export default function App() {

  // Variables
  const [mostrar, setMostrar] = useState("0");
  const [valor1, setValor1] = useState(null);
  const [operacion, setOperacion] = useState(null);

  // Funcionalidades
  function clear() {
    setMostrar("0");
    setValor1(null);
  }
  function coma() {
    if (mostrar.lastIndexOf(".") == -1) {
      setMostrar(mostrar + ".")
    }
  }
  function calcular() {
    switch (operacion) {
      case "/":
        division();
        break;
      case "x":
        multiplicacion();
        break;
      case "-":
        resta();
        break;
      case "+":
        suma();
        break;
    }
  }

  // Operaciones
  function inversNum() {
    setMostrar((1 / mostrar).toFixed(4));
  }

  function suma() {

    if (valor1 != null) {
      setMostrar(parseFloat(mostrar) + valor1);

    } else {
      setOperacion("+");
      setValor1(parseFloat(mostrar));
      setMostrar("0");
    }
  }

  function division() {

    if (valor1 != null) {
      setMostrar(valor1 / parseFloat(mostrar));

    } else {
      setOperacion("/");
      setValor1(parseFloat(mostrar));
      setMostrar("0");
    }
  }

  function resta() {

    if (mostrar === "0") {
      if (mostrar.indexOf("-") === -1)
      setMostrar("-");
    } else {
      if (valor1 != null) {
        setMostrar(valor1 - parseFloat(mostrar));

      } else {
        setOperacion("-");
        setValor1(parseFloat(mostrar));
        setMostrar("0");
      }
    }
  }

  function multiplicacion() {
    if (valor1 != null) {
      setMostrar(valor1 * parseFloat(mostrar));

    } else {
      setOperacion("x");
      setValor1(parseFloat(mostrar));
      setMostrar("0");
    }
  }

  function calcFactorial() {
    resultado = 1;
    for (i = 1; i <= mostrar; i++) {
      resultado *= i;
    }
    setMostrar(resultado);
  }

  function calcRCuadrada() {
    setMostrar((Math.sqrt(mostrar).toFixed(4)));
  }

  // Números
  function handleOnPress(num) {
    if (mostrar === "0") {
      setMostrar(num)
    } else if (mostrar.length < 11) {
      setMostrar(mostrar + num);
    }
  }

  return (

    <NativeBaseProvider>
      <Center w="80%">
        <Box safeArea p="2" w="90%" maxW="290" py="5">
          <Heading size="lg" color="coolGray.800" _dark={{ color: "warmGray.50" }} fontSize="48" fontWeight="semibold">Calculadora</Heading>

          <VStack space={2} mt="5">
            <View style={{ flexDirection: "row", marginBottom: -20, height: 70, width: 335, borderRadius: 4, borderWidth: 1 }}>
              <Text style={{ fontSize: 50, textAlign: "right", flex: 1 }}>{mostrar}</Text>
            </View>
            <View style={{ flexDirection: "row" }}>
              <View style={{ padding: 2 }}>
                <Button onPress={inversNum} size="20" mt="5" colorScheme="gray"> 1/X </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={calcFactorial} size="20" mt="5" colorScheme="gray"> ! </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={calcRCuadrada} size="20" mt="5" colorScheme="gray"> √ </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={division} size="20" mt="5" colorScheme="gray"> / </Button>
              </View>
            </View>
            <View style={{ flexDirection: "row" }}>
              <View style={{ padding: 2 }}>
                <Button onPress={() => handleOnPress("7")} size="20" mt="-1" colorScheme="blue"> 7 </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={() => handleOnPress("8")} size="20" mt="-1" colorScheme="blue"> 8 </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={() => handleOnPress("9")} size="20" mt="-1" colorScheme="blue"> 9 </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={multiplicacion} size="20" mt="-1" colorScheme="gray"> x </Button>
              </View>
            </View>
            <View style={{ flexDirection: "row" }}>
              <View style={{ padding: 2 }}>
                <Button onPress={() => handleOnPress("4")} size="20" mt="-1" colorScheme="blue"> 4 </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={() => handleOnPress("5")} size="20" mt="-1" colorScheme="blue"> 5 </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={() => handleOnPress("6")} size="20" mt="-1" colorScheme="blue"> 6 </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={resta} size="20" mt="-1" colorScheme="gray"> - </Button>
              </View>
            </View>
            <View style={{ flexDirection: "row" }}>
              <View style={{ padding: 2 }}>
                <Button onPress={() => handleOnPress("1")} size="20" mt="-1" colorScheme="blue"> 1 </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={() => handleOnPress("2")} size="20" mt="-1" colorScheme="blue"> 2 </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={() => handleOnPress("3")} size="20" mt="-1" colorScheme="blue"> 3 </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={suma} size="20" mt="-1" colorScheme="gray"> + </Button>
              </View>
            </View>
            <View style={{ flexDirection: "row" }}>
              <View style={{ padding: 2 }}>
                <Button onPress={clear} size="20" mt="-1" colorScheme="gray"> C </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={() => handleOnPress("0")} size="20" mt="-1" colorScheme="blue"> 0 </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={coma} size="20" mt="-1" colorScheme="gray"> , </Button>
              </View>
              <View style={{ padding: 2 }}>
                <Button onPress={calcular} size="20" mt="-1" colorScheme="gray"> = </Button>
              </View>
            </View>
          </VStack>
        </Box>
      </Center>
    </NativeBaseProvider>
  )
};