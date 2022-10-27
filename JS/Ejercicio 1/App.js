import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, TextInput, View } from 'react-native';
import { Article } from './Components/Article'

export default function App() {
  /*let content = {
    parOne: 'Parágrafo 1',
    parTwo: 'Parágrafo 2',
    title: 'Esto es el título',
  }*/
  /*function Article(){
    return (
    <View style={styles.container}>
        <Text style={styles.title}>{content.title}</Text>
      <Text>{a}</Text>
      <Text>Hola</Text>
      <Text>{content.parOne}</Text>
      <Text>{content.parTwo}</Text>
    </View>)
  }*/

  function Articles(){
    let artic = [];

    for (let i = 0; i < 4; i++) {
      artic.push(
        <Article key = {i}/>
      )
    }
    return (artic)
  }


  return (
    
    <View style={styles.container}>
      <Articles/>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'red',
    alignItems: 'center',
    justifyContent: 'center',
  },
  title: {
    fontSize: 12,
    textDecorationLine: 'underline',
    fontWeight: 'bold',
  }
});
