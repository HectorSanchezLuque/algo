import { TextInput, Text, ScrollView, View } from 'react-native';
import { useState } from 'react';
import { Center, Box, Heading, VStack, NativeBaseProvider } from "native-base";
import axios from 'axios';

export default function Crosswords() {

  const [words, setWords] = useState("");
  const [word, setWord] = useState("");
  // 1 – Software (vertical). 2 – Developer (horizontal). 3 – System (horizontal). 4 – App (horizontal).
  //5 – Framework (horizontal).


  const [datos, setDatos] = useState(['Software', 'Developer', 'System', 'App', 'Framework']);
  const [defint, setDefint] = useState(['']);
  const getDatos = async () => {
    let def = [];
    try {
        const response = await axios.get('https://api.dictionaryapi.dev/api/v2/entries/en/' + datos[0]);
        def.push(response.data[0].meanings[0].definitions[0].definition);

        const response1 = await axios.get('https://api.dictionaryapi.dev/api/v2/entries/en/' + datos[1]);
        def.push(response.data[0].meanings[0].definitions[0].definition);
        
        const response2 = await axios.get('https://api.dictionaryapi.dev/api/v2/entries/en/' + datos[2]);
        def.push(response.data[0].meanings[0].definitions[0].definition);
        
        const response3 = await axios.get('https://api.dictionaryapi.dev/api/v2/entries/en/' + datos[3]);
        def.push(response.data[0].meanings[0].definitions[0].definition);
        
        const response4 = await axios.get('https://api.dictionaryapi.dev/api/v2/entries/en/' + datos[4]);
        def.push(response.data[0].meanings[0].definitions[0].definition);
        
        setDefint(def);
      
    } catch (error) {
      console.error(error);
    }
  }

  function press1() {
    console.log(words);
  }
  return (
    <NativeBaseProvider>
      <Center w="100%">
        <Box safeArea p="2" w="90%" maxW="290" py="5">
          <Heading size="lg" color="coolGray.800" _dark={{ color: "warmGray.50" }} fontSize="50" fontWeight="semibold" onPress={getDatos}>Crosswords</Heading>

          <VStack space={2} mt="5">

            <View style={{ justifyContent: 'center', alignItems: 'center' }}>
              <View style={{ flexDirection: "row" }}>
                <View style={{ flexDirection: "column" }}>

                  <View style={{ flexDirection: "column" }}>


                    <View style={{ flexDirection: "row" }}>
                      <View style={{ width: 134 }}>
                      </View>
                      <View style={{ width: 16 }}>
                        <Text style={{ fontSize: 20 }}
                          onPress={press1} >1</Text>
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={"S"} size="20" defaultValue={word} onChangeText={newWord => setWords(newWord)} />
                      </View>
                    </View>

                    <View style={{ flexDirection: "row" }}>
                      <View style={{ width: 16 }}>
                        <Text style={{ fontSize: 20 }}
                          onPress={press1}>2</Text>
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={"o"} size="20" defaultValue={word} onChangeText={newWord => setWords(newWord)} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>

                    </View>

                    <View style={{ flexDirection: "row" }}>
                      <View style={{ width: 150 }}>
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={"f"} size="20" defaultValue={0} />
                      </View>
                    </View>

                    <View style={{ flexDirection: "row" }}>
                      <View style={{ width: 54 }}>
                      </View>
                      <View style={{ width: 16 }}>
                        <Text style={{ fontSize: 20 }}
                          onPress={press1}>3</Text>
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={"t"} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ width: 64 }}>
                      </View>
                    </View>

                    <View style={{ flexDirection: "row" }}>
                      <View style={{ width: 150 }}>
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={"w"} size="20" defaultValue={0} />
                      </View>
                    </View>

                    <View style={{ flexDirection: "row" }}>
                      <View style={{ width: 134 }}>
                      </View>
                      <View style={{ width: 16 }}>
                        <Text style={{ fontSize: 20 }}
                          onPress={press1}>4</Text>
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={"a"} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ width: 64 }}>
                      </View>
                    </View>

                    <View style={{ flexDirection: "row" }}>
                      <View style={{ width: 150 }}>
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={"r"} size="20" defaultValue={0} />
                      </View>
                    </View>

                    <View style={{ flexDirection: "row" }}>
                      <View style={{ width: 27 }}>
                      </View>
                      <View style={{ width: 16 }}>
                        <Text style={{ fontSize: 20 }}
                          onPress={press1}>5</Text>
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={"e"} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                      <View style={{ padding: 2, borderWidth: 1 }}>
                        <TextInput placeholder={""} size="20" defaultValue={0} />
                      </View>
                    </View>
                  </View>
                </View>
              </View>
              <ScrollView>
                <View style={{ height: 27 }}>
                </View>
                <Heading size="lg" color="coolGray.800" _dark={{ color: "warmGray.50" }} fontSize="30" fontWeight="semibold">Definitions</Heading>
                <Text>1. {defint[0]}</Text>
                <Text>2. {defint[1]}</Text>
                <Text>3. {defint[2]}</Text>
                <Text>4. {defint[3]}</Text>
                <Text>5. {defint[4]}</Text>
              </ScrollView>

            </View>
          </VStack>
        </Box>
      </Center>
    </NativeBaseProvider>
  )
}