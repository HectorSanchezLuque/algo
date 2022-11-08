import * as React from 'react';
import { StyleSheet, Text, View, Button } from 'react-native';

const Inicio = (props) => {
    return (
        <View style={styles.layout}>
            <Text style={styles.title}>Word Games</Text>
            <Button
                title="GO TO SCREEN 1"
                onPress={() => props.navigation.navigate('Screen1')}
            />
        </View>
    );
};
const styles = StyleSheet.create({
    layout: {
        flex: 1,
        justifyContent: 'center',
        padding: 8,
    },
    title: {
        margin: 24,
        fontSize: 18,
        fontWeight: 'bold',
        textAlign: 'center',
    },
});
export default Inicio;